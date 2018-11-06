package com.dgf.mms.modules.bbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2018-11-04 11:32:33
 * @author dgf
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class BbsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BbsApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello bbs1";
    }
}
