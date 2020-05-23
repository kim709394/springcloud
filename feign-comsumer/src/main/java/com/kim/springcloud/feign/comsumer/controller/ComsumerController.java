package com.kim.springcloud.feign.comsumer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */
@RestController
@RequestMapping("/feign/comsumer")
public class ComsumerController {

    @GetMapping("/get")
    public String get(){
        return "get方法";
    }

    @PostMapping("/post")
    public String post(@RequestBody Map<String,Object> param) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        return mapper.writeValueAsString(param);
    }


    @GetMapping("/use/url")
    public String useUrl(){
        return "feign脱离eureka使用url调用";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file){
        System.out.println(file);
        return "文件上传";
    }

}
