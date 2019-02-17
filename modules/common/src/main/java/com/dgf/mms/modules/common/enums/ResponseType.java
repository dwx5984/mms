package com.dgf.mms.modules.common.enums;

/**
 * <p>物品分类枚举</p>
 * @author dengganfeng
 * @since 2019-02-16 22:47:58
 */
public enum ResponseType implements BaseEnum {
    /**
     * 响应状态
     */
    OK(0, "请求成功", "请求成功"),
    ERROR(1, "系统错误", "系统错误"),
    SYSTEM_BUSY(2, "系统繁忙", "系统繁忙"),
    ACCESS_ERROR(3, "访问数据出错", "访问数据出错")
    ;

    private Integer value;
    private String name;
    private String desc;

    ResponseType(Integer value, String name, String desc) {
        this.value = value;
        this.name = name;
        this.desc = desc;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
