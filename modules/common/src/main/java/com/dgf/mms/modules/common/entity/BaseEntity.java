package com.dgf.mms.modules.common.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>实体基类</p>
 * T 主键类型
 * @author dengganfeng
 * @date 2019-02-16 21:27:25
 *
 * <p>
 *
 * </p>
 */
public abstract class BaseEntity<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 备注
     */
    protected String remarks;

    /**
     * 删除标记
     */
    protected String delFlag;

    /**
     * 创建人
     */
    protected String createBy;

    /**
     * 更新人
     */
    protected String updateBy;

    /**
     * 创建日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime createDate;

    /**
     * 更新日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected LocalDateTime updateDate;
}
