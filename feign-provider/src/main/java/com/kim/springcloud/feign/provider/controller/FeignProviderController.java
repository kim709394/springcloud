package com.kim.springcloud.feign.provider.controller;

import com.kim.springcloud.feign.provider.feignclient.FeignClientFileUpload;
import com.kim.springcloud.feign.provider.feignclient.FeignClientFoo;
import com.kim.springcloud.feign.provider.feignclient.FeignClientWithoutEureka;
import feign.form.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */
@RestController
@RequestMapping("/feign/provider")
public class FeignProviderController {

    @Autowired
    private FeignClientFoo clientFoo;

    @Autowired
    private FeignClientWithoutEureka clientWithoutEureka;

    @Autowired
    private FeignClientFileUpload clientFileUpload;

    @GetMapping("/clientFoo")
    public String clientFoo(){
        String get = clientFoo.get();
        System.out.println(get);
        Map<String,Object> param=new HashMap<>();
        param.put("param","参数");
        String post = clientFoo.post(param);
        System.out.println(post);

        return "clientFoo测试";
    }

    @GetMapping("/clientWithoutEureka")
    public String clientWithoutEureka(){
        String useUrl = clientWithoutEureka.useUrl();
        System.out.println(useUrl);
        return "clientWithoutEureka测试";
    }

    @GetMapping("/clientFileUpload")
    public String clientFileUpload() throws Exception {
        File file=new File("d:/test1/jpg");
        MultipartFile multipartFile = new MockMultipartFile("test1.jpg","test1.jpg", ContentType.MULTIPART.toString(),new FileInputStream(file));
        String upload = clientFileUpload.upload(multipartFile);
        System.out.println(upload);
        return "clientFileUpload测试";
    }
}
