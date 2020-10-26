package com.consumer.consul;

import com.consumer.Ribbon.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "cloud-payment06-server ",configuration = RibbonConfig.class)
public class ConsulMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsulMain.class,args);
    }
}
