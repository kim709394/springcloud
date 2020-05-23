package com.kim.springcloud.feign.provider;

import com.kim.springcloud.feign.provider.annotation.ExcludeFeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages ="com.kim.springcloud.feign.provider.feignclient" )
/**
 * springboot父容器排除feign的自定义配置类
 * */
@ComponentScan(excludeFilters ={ @ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeFeignConfig.class)})
public class FeignProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignProviderApplication.class);
    }
}
