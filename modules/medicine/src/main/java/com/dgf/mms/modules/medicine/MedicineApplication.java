package com.dgf.mms.modules.medicine;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @date 2018-11-04 00:14:52
 * @author dgf
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.dgf.mms"})
@RestController
@MapperScan("com.dgf.mms.modules.medicine.medicine.mapper")
public class MedicineApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicineApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello medicine1";
    }

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Value("${session.login.user.key}")
    private String user;


    @RequestMapping("/login")
    public String login(HttpServletRequest request) {

            HttpSession session = request.getSession();
            session.setAttribute(user, user);
            redisTemplate.opsForValue().set(user, session.getId());

            return session.getId();

    }
}
