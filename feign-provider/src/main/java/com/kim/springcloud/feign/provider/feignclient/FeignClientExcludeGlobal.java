package com.kim.springcloud.feign.provider.feignclient;

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
@FeignClient(name="feign-comsumer",configuration = FeignClientExcludeGlobal.class)
public interface FeignClientExcludeGlobal {

    @GetMapping("/get")
    public String get();

    @PostMapping("/post")
    public String post(@RequestBody Map<String,Object> param);

}
