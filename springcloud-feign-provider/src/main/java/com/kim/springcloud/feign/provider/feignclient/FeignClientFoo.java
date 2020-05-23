package com.kim.springcloud.feign.provider.feignclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kim.springcloud.feign.provider.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */
//feign调用eureka的服务的时候，name指定调用在eureka中的某个服务的名称(application.name),configuration指定feign的配置
@FeignClient(name="springcloud-feign-comsumer",configuration = FeignConfig.class)
public interface FeignClientFoo {

    @GetMapping("feign/comsumer/get")
    String get();

    @PostMapping("/feign/comsumer/post")
    String post(@RequestBody Map<String,Object> param);

}
