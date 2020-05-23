package com.kim.springcloud.feign.provider.feignclient;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */

import com.kim.springcloud.feign.provider.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 脱离eureka进行rest请求的feign客户端，name不再指在eureka中的服务的名字，只是指定feign客户端的
 * 名字而已。url是请求的地址，configuration是配置类，现在进行eureka的请求
 * */
@FeignClient(name="FeignClientWithoutEureka",url="/feign/comsumer",configuration = FeignConfig.class)
public interface FeignClientWithoutEureka {


    @GetMapping("/use/url")
    String useUrl();



}
