package com.kim.springcloud.hystrix.dashboard.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangjie
 * @description
 * @date 2020/5/24
 */
@RestController
@RequestMapping("/hystrix/dashboard")
public class FooController {


    /**
     * 使用断路器保护接口，如果接口方法里面出现超时，断路器将开启，不执行接口里面的代码，
     * 直接调用fallback里面指定的方法，注意fallbackmethod属性指定的方法的方法名和参数和返回值访问修饰符等
     * 要和接口的方法一致。
     * */
    @GetMapping("/test")
    @HystrixCommand(fallbackMethod = "hystrixFallback")
    public String testFeign(boolean process) {
        if(process){
            throw new RuntimeException("超时啦");
        }
        return "正常返回";
    }

    public String hystrixFallback(boolean process){
        return "调用超时方法";
    }


}
