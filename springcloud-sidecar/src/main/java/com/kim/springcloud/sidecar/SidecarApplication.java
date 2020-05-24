package com.kim.springcloud.sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * @author huangjie
 * @description
 * 非java语言服务注册到eureka上
 * @date 2020/5/24
 */
@SpringBootApplication
/**
 * 引入sidecar功能，是一个组合注解，组合了zuul代理、断路器
 * */
@EnableSidecar
@EnableEurekaClient
public class SidecarApplication {


    public static void main(String[] args) {
        SpringApplication.run(SidecarApplication.class);
    }

}
