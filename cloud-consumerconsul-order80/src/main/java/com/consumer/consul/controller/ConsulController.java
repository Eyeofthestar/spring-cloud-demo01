package com.consumer.consul.controller;


import com.cloud.api.data.Constant;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsulController {

//    Consul 地址   cloud-payment06-server  注册中心的服务名称
    private  static  final  String  INVOCK_URL= Constant.INVOCK_URL;

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/payment/consul")
    public String getInvoc(){
//        INVOCK_URL+"/payment/consul"  完整的访问地址
        return restTemplate.getForObject(INVOCK_URL+"/payment/consul",String.class);
    }

    @RequestMapping("/consumer/payment/consul2")
    public String getInvoc2(){
//        INVOCK_URL+"/payment/consul"  完整的访问地址
        ResponseEntity<String> payEntity = restTemplate.getForEntity(INVOCK_URL + "/payment/consul", String.class);
        if (payEntity.getStatusCode().is2xxSuccessful()){
//             payEntity.getBody() 将Entity 对象转换成json格式
            return payEntity.getBody();
        }
        return "error";
    }
}
