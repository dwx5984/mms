package com.dgf.mms.modules.medicine;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2018-11-04 00:14:52
 * @author dgf
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class MedicineApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicineApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello medicine1";
    }
}
