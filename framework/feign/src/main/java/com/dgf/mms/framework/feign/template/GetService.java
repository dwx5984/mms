package com.dgf.mms.framework.feign.template;

import com.dgf.mms.modules.common.response.ResultDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @date 2018-11-08 23:07:25
 * @author dgf
 */
@Component
@FeignClient(value = "customer") //开启FeignClient注解,value表示指向那个服务
public interface GetService {
    /**
     * 返回Customer服务的某些数据
     * requestMapping 对应被指向的服务的具体requestMapping
     * @return Result<Customers>
     */
    @RequestMapping("/hello")
    String getCustomers();

    @RequestMapping("/customer/customer/get")
    ResultDTO get();
}
