package com.kim.springcloud.eureka.client.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangjie
 * @description   RestTemplate对象，可使用restTemplate对象等同feign使用，作为eureka的客户端调用服务的对象
 * 不过此对象基本弃用
 * @date 2020/5/23
 */
@SpringBootConfiguration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
