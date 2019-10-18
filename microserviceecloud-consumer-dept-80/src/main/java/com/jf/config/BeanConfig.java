package com.jf.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 潇潇暮雨
 * @create 2018-12-02   9:17
 */
@Configuration // 这个注解代替Spring的ApplicationContext.xml
public class BeanConfig {

    /**
     * RestTemplate提供了多种便捷访问远程Http服务的方法， 
     * 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集
     */
    @Bean
    @LoadBalanced // Spring Cloud Ribbon是基于Netflix Ribbon试下你的一套客户端，负载均衡的工具。
    public RestTemplate restTemplate() {
        System.out.println("创造了一个bean,id为restTemplate");
        return new RestTemplate();
    }
}































