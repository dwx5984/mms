package com.dgf.mms.modules.common.enums;

/**
 * <p>物品分类枚举</p>
 * @author dengganfeng
 * @date 2019-02-16 21:01:19
 */
public enum Classification implements BaseEnum {
    /**
     * 药品分类
     */
    MALE(0, "男科用药", "男科用药"),
    GYNECOLOGY(1, "妇科用药", "妇科用药"),
    NERVE(2, "神经用药", "神经用药"),
    HEARTBRAIN(3, "心脑用药", "心脑用药"),
    HEPATOLOGY(4, "肝胆用药", "肝胆用药"),
    RESPIRATORY(5, "呼吸道用药", "呼吸道用药"),
    SKIN(6, "皮肤用药", "皮肤用药"),
    HEALTHCARE(7, "保健用品", "保健用品"),
    ENDOCRIN(8, "内分泌用药", "内分泌用药"),
    TUMOR(9, "肿瘤用药", "肿瘤用药")
    ;

    private Integer value;

    private String name;

    private String desc;

    Classification(Integer value, String name, String desc) {
        this.value = value;
        this.name = name;
        this.desc = desc;
    }


    @Override
    public Integer getValue() {
        return value;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getDesc() {
        return desc;
    }
}
