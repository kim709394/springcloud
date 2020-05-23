package com.kim.springcloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author huangjie
 * @description   脱离eureka使用断路器
 * @date 2020/5/24
 */
@SpringBootApplication
@EnableHystrix  //启用断路器，同等于@EnableCircuitBreaker
public class HystrixApplication {


    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class);
    }
}
