package com.dgf.mms.modules.customer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2018-11-04 00:09:10
 * @author dgf
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@MapperScan("com.dgf.mms.modules.customer.customer.mapper")
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello customer1";
    }

}
