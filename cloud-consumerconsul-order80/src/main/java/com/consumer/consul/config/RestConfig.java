package com.consumer.consul.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfig {

//    @LoadBalanced  在使用ribbon做负载均衡时 给RestTemplate 添加这个注解能
//    能让他拥有负载均衡的能力
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
