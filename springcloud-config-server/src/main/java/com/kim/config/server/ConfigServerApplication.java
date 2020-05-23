package com.kim.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */
@SpringBootApplication
@EnableConfigServer   //启用配置中心服务端
@EnableEurekaClient
public class ConfigServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class);
    }

}
