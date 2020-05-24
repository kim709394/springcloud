package com.kim.springcloud.feign.provider.builder;

import feign.Contract;
import feign.Feign;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author huangjie
 * @description   手动构建feign
 * @date 2020/1/15
 */

public interface FeignBuilder {


    /**
     * 构建feign接口
     * */
    <T> T build(Class<T> t, String url);








    @Service
    @Import(FeignClientsConfiguration.class)
    class FeignBuilderImpl implements FeignBuilder{

        static Map<String,Object> feignContext=new ConcurrentHashMap<>();

        @Autowired
        private Decoder decoder;
        @Autowired
        private Encoder encoder;

        @Autowired
        private Contract contract;

        @Override
        public synchronized  <T> T build(Class<T> t, String url) {
            if(StringUtils.isEmpty(url)){
                throw new IllegalArgumentException("url isn't allowed empty");
            }
            Object o = feignContext.get(url);
            if(o!=null){
                return (T)o;
            }
            T target = Feign.builder().decoder(decoder).encoder(encoder).contract(contract).target(t, url);
            feignContext.put(url,target);
            return target;
        }
    }


}
