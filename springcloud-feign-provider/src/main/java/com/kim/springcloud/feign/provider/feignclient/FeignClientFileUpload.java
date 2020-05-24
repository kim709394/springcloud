package com.kim.springcloud.feign.provider.feignclient;

import com.kim.springcloud.feign.provider.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author huangjie
 * @description   feign进行文件上传，feign目前版本不支持文件流边读边传输，只是流文件全部读到内存再进行传输，
 * 因此传输大文件时占用内存比较大，因此大文件传输不适合
 * @date 2020/5/23
 */

//@FeignClient(name="springcloud-feign-comsumer",configuration = FeignConfig.class)
public interface FeignClientFileUpload {

    @PostMapping(value = "/feign/comsumer/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    String upload(@RequestPart("file") MultipartFile file);

}
