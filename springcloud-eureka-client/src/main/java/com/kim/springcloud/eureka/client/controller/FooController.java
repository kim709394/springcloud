package com.kim.springcloud.eureka.client.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangjie
 * @description   eureka-client的几个对象，可以获取eureka的服务信息
 * @date 2020/5/24
 */
@RestController
@RequestMapping("/eureka/client")
public class FooController {


    @Autowired
    private RestTemplate restTemplate;//使用基于rest风格的httpclient调取服务接口的对象

    @Autowired
    private EurekaClient eurekaClient;//eureka客户端，可以获取服务实例信息

    @Autowired
    private LoadBalancerClient loadBalancerClient;//ribbon负载均衡器对象


    @GetMapping("/handle/providerone")
    public String handleService(){

        //调取服务实例名为springcloud-feign-comsumer的/handler接口
        String result=restTemplate.getForObject("http://springcloud-feign-comsumer/feign/comsumer/get",String.class);

        return result;

    }

    @GetMapping("/getproperties")
    public InstanceInfo getProperties(){
        Applications applications= eurekaClient.getApplications();

        InstanceInfo comsumer=eurekaClient.getNextServerFromEureka("springcloud-feign-comsumer",false);
        return comsumer;
    }

    @GetMapping("/testLoadBalance")
    public ServiceInstance[] testLoadBalance(){
        //通过ribbon负载均衡器获取服务实例信息，默认是轮询算法
        ServiceInstance serviceInstance=loadBalancerClient.choose("springcloud-feign-comsumer");
        System.out.println("调取服务springcloud-feign-comsumer的端口号"+serviceInstance.getPort());

        return new ServiceInstance[]{serviceInstance};

    }
}
