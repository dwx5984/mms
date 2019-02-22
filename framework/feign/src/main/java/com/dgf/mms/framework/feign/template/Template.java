package com.dgf.mms.framework.feign.template;

import com.dgf.mms.modules.common.response.ResultDTO;
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
        String res;
        try {
            res = getService.getCustomers();
            System.out.println("============:::"+ res);
            return res;
        } catch (Exception e){
            e.printStackTrace();
        }
        return "ERROR";

    }

    @RequestMapping("/get")
    public Object get(){
        Object res;
        res = getService.get();
    }
}
