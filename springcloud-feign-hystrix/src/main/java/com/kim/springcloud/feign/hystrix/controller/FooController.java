package com.kim.springcloud.feign.hystrix.controller;

import com.kim.springcloud.feign.hystrix.feignclient.FooFeign;
import com.kim.springcloud.feign.hystrix.feignclient.FoooFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjie
 * @description   测试
 * @date 2020/5/24
 */
@RestController
@RequestMapping("/feign/hystrix")
public class FooController {


    @Autowired
    private FoooFeign foooFeign;

    @Autowired
    private FooFeign fooFeign;



    @GetMapping("/fooFeign")
    public String fooFeign(){
        return fooFeign.get();
    }


    @GetMapping("/foooFeign")
    public String foooFeign(){
        return foooFeign.get();
    }






}
