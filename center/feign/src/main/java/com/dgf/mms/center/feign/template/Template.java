package com.dgf.mms.center.feign.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date 2018-11-08 23:05:02
 * @author dgf
 */
@RestController
public class Template {
    @Autowired
    private GetService getService;
    @RequestMapping("/getCustomers")
    public String getService(){
        return getService.getCustomers();
    }
}
