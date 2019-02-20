package com.dgf.mms.modules.customer.customer.entity;

import com.dgf.mms.modules.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author dengganfeng
 * @since 2019-02-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Customer extends BaseEntity<Customer> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 电话
     */
    private String phone;

    /**
     * 身份证
     */
    private String idcard;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 个性签名
     */
    private String sign;

    /**
     * 用户类型(枚举)
     */
    private Integer type;

    /**
     * 用户住址
     */
    private String address;

}
