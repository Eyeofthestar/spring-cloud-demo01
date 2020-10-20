package com.consumer.consul.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsulController {

//    Consul 地址   cloud-payment06-server  注册中心的服务名称
    private  static  final  String  INVOCK_URL="http://cloud-payment06-server";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/consul")
    public String getInvoc(){
//        INVOCK_URL+"/payment/consul"  完整的访问地址
        return restTemplate.getForObject(INVOCK_URL+"/payment/consul",String.class);
    }
}
