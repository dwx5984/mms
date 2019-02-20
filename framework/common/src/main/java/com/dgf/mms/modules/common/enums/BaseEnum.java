package com.dgf.mms.modules.common.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * <p>枚举封装接口</p>
 * @author dengganfeng
 * @2019-02-16 21:07:55
 */
public interface BaseEnum extends IEnum<Integer> {
    /**
     * 返回枚举名字
     * @return
     */
    String getName();

    /**
     * 返回枚举描述
     * @return
     */
    String getDesc();
}
