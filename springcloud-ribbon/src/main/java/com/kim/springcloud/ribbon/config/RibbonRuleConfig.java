package com.kim.springcloud.ribbon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author king
 * 2018/12/1
 *
 * java代码方式配置ribbon算法规则
 */
//@SpringBootConfiguration
public class RibbonRuleConfig {

    /**
     * 配置负载均衡算法为随机规则
     * */
    @Bean
    public IRule providerOneRule(){
        return new RandomRule();
    }

}
