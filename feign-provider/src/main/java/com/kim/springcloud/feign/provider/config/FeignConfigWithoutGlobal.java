package com.kim.springcloud.feign.provider.config;

import com.kim.springcloud.feign.provider.annotation.ExcludeFeignConfig;
import feign.Logger;
import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;

/**
 * @author huangjie
 * @description
 * @date 2020/5/23
 */
@ExcludeFeignConfig
public class FeignConfigWithoutGlobal {

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
