package com.dgf.mms.modules.common.enums;

public enum DrugType implements BaseEnum {
    /**
     * 药品类别
     */

    PRESCRIPTION(0, "处方药", "处方药凭医生开的药方或证明才能购买"),
    OTC(1, "非处方药", "非处方药")
    ;

    private Integer value;

    private String name;

    private String desc;

    DrugType(Integer value, String name, String desc) {
        this.value = value;
        this.name = name;
        this.desc = desc;
    }
    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
