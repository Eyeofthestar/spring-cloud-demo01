package com.consumer.order.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class KzController {

//    zookeeper 地址
    private  static  final  String  INVOCK_URL="http://cloud-payment04-server";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/zk")
    public String getInvoc(){
        System.out.println();
//        INVOCK_URL+"/payment/zk"  完整的访问地址
        return restTemplate.getForObject(INVOCK_URL+"/payment/zk",String.class);
    }
}
