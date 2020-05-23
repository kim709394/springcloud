package com.kim.springcloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huangjie
 * @description ribbon集成在eureka中，因此只要引入eureka-client的包，就不需要再引入ribbon的包了
 * ribbon是一种客户端负载均衡器，默认规则是轮询，ribbon通常结合feign使用。
 * 可以手动设置ribbon的负载均衡算法，有三种方式:1、主配置文件方式,2、java代码方式，3、默认配置
 * <p>
 *  1、java代码方式,加入注解为不同的服务指定不同的规则，否则全局配置
 * 配置ribbon负载均衡算法，name是指定  springcloud-feign-comsumer  为服务名的算法为一个
 * 配置类，在该配置类里面配置具体的算法的bean，注意，该配置类不可以放在springboot父容器，
 * 也就是说不能放在@SpringBootApplication默认扫描的包和子包里面，也不能放在@ComponentScan
 * 注解能够扫描到的包里面，否则该配置类配置的负载均衡算法规则将视为全局规则，对全部服务的调取
 * 都生效。
 * @RibbonClient(name="springcloud-feign-comsumer",configuration = RibbonRuleConfig.class)
 * 如果@RibbonClient注解的配置类一定要放在父容器当中，那么在配置ComponentScan注解的时候，
 * 需加上以下配置，然后再自定义一个@ExcludeFromComponentScan的注解，再在该配置类中加上
 * 自己定义的注解即可。意思是说，ComponentScan在扫描spring的注解生成Bean放入springboot父容器
 * 的时候，将排除含有ExcludeFromComponentScan注解的类，如此，负载均衡规则类就不会被全局扫描。
 * @ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFromComponentScan.class) })
 *
 *@date 2020/5/23
        */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.kim.springcloud.ribbon.feign")

public class RibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class);
    }

}
