package com.kim.springcloud.ribbon.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */
//feign调用eureka的服务的时候，name指定调用在eureka中的某个服务的名称(application.name),configuration指定feign的配置
@FeignClient(name="springcloud-feign-comsumer")
public interface FeignClientFoo {

    @GetMapping("feign/comsumer/get")
    String get();


}
