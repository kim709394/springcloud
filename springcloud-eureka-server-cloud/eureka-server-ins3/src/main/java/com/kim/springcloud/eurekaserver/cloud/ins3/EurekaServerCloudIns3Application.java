package com.kim.springcloud.eurekaserver.cloud.ins3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerCloudIns3Application {



    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCloudIns3Application.class);
    }
}
