package com.kim.springcloud.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huangjie
 * @description
 * @date 2022-10-28
 */
@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class);
    }
}
