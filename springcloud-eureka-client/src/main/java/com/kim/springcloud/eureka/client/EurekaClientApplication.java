package com.kim.springcloud.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class);
    }

}
