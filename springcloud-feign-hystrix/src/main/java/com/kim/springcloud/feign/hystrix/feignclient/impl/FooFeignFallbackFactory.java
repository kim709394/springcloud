package com.kim.springcloud.feign.hystrix.feignclient.impl;

import com.kim.springcloud.feign.hystrix.feignclient.FooFeign;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author huangjie
 * @description
 * @date 2020/5/24
 */

/**
 * FooFeign调用异常时回调，实现FallbackFactory，指定泛型为FooFeign，重写create方法，返回FooFeign对象，重写接口的方法
 * 这里的重写方法作为FooFeign调用失败时的回调方法。此种方式可以知道失败原因，推荐
 * */
public class FooFeignFallbackFactory implements FallbackFactory<FooFeign> {

    private static final Logger LOGGER= LoggerFactory.getLogger(FooFeignFallbackFactory.class);

    @Override
    public FooFeign create(Throwable throwable) {

        //异常打印
        LOGGER.error(throwable+"");

        return new FooFeign() {
            @Override
            public String get() {
                return "异常原因:"+throwable;
            }
        };
    }
}
