package com.kim.springcloud.feign.hystrix.feignclient;

import com.kim.springcloud.feign.hystrix.feignclient.impl.FooFeignFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangjie
 * @description
 * @date 2020/5/24
 */
/**
 * fallbackFactory指定feign调用失败时的回调类
 * */
@FeignClient(name="springcloud-feign-comsumer",fallbackFactory = FooFeignFallbackFactory.class)
public interface FooFeign {


    @GetMapping("feign/comsumer/get")
    String get();

}
