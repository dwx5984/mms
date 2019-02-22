package com.dgf.mms.modules.customer.customer.service.impl;

import com.dgf.mms.modules.customer.customer.entity.Customer;
import com.dgf.mms.modules.customer.customer.mapper.CustomerMapper;
import com.dgf.mms.modules.customer.customer.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author dengganfeng
 * @since 2019-02-19
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
