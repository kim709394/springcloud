package com.kim.springcloud.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author huangjie
 * @description  加入监控视图查看断路器状态
 * @date 2020/5/24
 */
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard   //启用断路器视图监控，路径：/hystrix,监控数据：/hystrix.stream,需要在健康检查那里加上。/actuator/hystrix.stream
public class HystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApplication.class);
    }

}
