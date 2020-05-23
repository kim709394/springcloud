package com.kim.springcloud.eurekaserver.cloud.ins1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerCloudIns1Application {


    public static void main(String[] args) {
        SpringApplication.run(EurekaServerCloudIns1Application.class);
    }

}
