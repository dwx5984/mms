package com.dgf.mms.modules.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2018-11-04 11:36:43
 * @author dgf
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello order1";
    }
}
