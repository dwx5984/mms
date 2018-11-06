package com.dgf.mms.modules.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2018-11-04 11:20:28
 * @author dgf
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MerchantApplication {
    public static void main(String[] args) {
        SpringApplication.run(MerchantApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello merchant1";
    }
}
