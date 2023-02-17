package com.kim.springcloud.feign.provider.config;

import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;

/**
 * @author huangjie
 * @description  feign-config,全局配置
 * @date 2020/5/22
 */
public class FeignConfig {


    //记得在application.yml上配置logging.level
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public Retryer retryer() {
        return Retryer.NEVER_RETRY;
    }

    /**
     * 设置超时时间
     * */
    @Bean
    public Request.Options options(){
        return new Request.Options(60*60*1000,60*60*1000);
    }


}
