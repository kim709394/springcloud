package com.kim.springcloud.feign.hystrix.feignclient.impl;

import com.kim.springcloud.feign.hystrix.feignclient.FoooFeign;

/**
 * @author huangjie
 * @description
 * @date 2020/5/24
 */
/**
 * FoooFeign调用失败时的回调类，实现FoooFeign，重写各接口方法。
 * 此种方式不能知道失败原因，不推荐
 * */
public class FoooFeignFallback implements FoooFeign {


    @Override
    public String get() {
        return "出现异常";
    }
}
