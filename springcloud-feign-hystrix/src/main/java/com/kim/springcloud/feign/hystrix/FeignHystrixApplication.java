package com.kim.springcloud.feign.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huangjie
 * @description
 * feign结合hystrix使用，feign整合了hystrix包，因此不需要再引入hystrix包了
 * @date 2020/5/24
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.kim.springcloud.feign.hystrix.feignclient")
public class FeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixApplication.class);
    }

}
