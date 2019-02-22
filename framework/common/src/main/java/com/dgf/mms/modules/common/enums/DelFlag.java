package com.dgf.mms.modules.common.enums;

/**
 * 逻辑删除标记
 * @author dengganfeng
 */
public enum DelFlag implements BaseEnum {
    /**
     * 逻辑删除标记
     */
    NORMAL(0, "正常", "数据正常"),
    DELETED(1, "已删除", "不显示该数据"),
    RESTRICT(2, "受限制", "等待审核")
    ;

    private Integer value;
    private String name;
    private String desc;
    DelFlag(Integer value, String name, String desc) {
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
