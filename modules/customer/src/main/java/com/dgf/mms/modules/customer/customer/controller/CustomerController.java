package com.dgf.mms.modules.customer.customer.controller;


import com.dgf.mms.modules.customer.customer.entity.Customer;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.dgf.mms.modules.common.controller.BaseController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author dengganfeng
 * @since 2019-02-19
 */
@RestController
@RequestMapping("/customer/customer")
public class CustomerController extends BaseController<Customer> {

}
