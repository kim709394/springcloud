package com.kim.springcloud.feign.hystrix.feignclient;

/**
 * @author huangjie
 * @description
 * @date 2020/5/24
 */

import com.kim.springcloud.feign.hystrix.feignclient.impl.FoooFeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * fallback指定feign调用失败时的回调类
 */
@FeignClient(name = "springcloud-feign-comsumer", fallback = FoooFeignFallback.class)
public interface FoooFeign {


    @GetMapping("feign/comsumer/get")
    String get();

}
