package com.dgf.mms.modules.common.enums;

/***
 * 药品种类
 * @author dengganfeng
 * @date 2019-02-16 21:19:55
 */
public enum DrugKind implements BaseEnum {
    /***
     * 药品种类
     */
    NEW_DRUG(0, "新药", "新药"),
    SPECIALTY_FRUG(1, "特药", "特药")
    ;

    private Integer value;
    private String name;
    private String desc;

    DrugKind(Integer value, String name, String desc) {
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
