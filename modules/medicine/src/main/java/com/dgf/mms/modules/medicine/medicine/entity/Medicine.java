package com.dgf.mms.modules.medicine.medicine.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.dgf.mms.modules.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * <p>
 * 药品表
 * </p>
 *
 * @author dengganfeng
 * @since 2019-02-16
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Medicine extends BaseEntity<Medicine> {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 商家id
     */
    private Integer merchantId;

    /**
     * 药品名
     */
    private String drugName;

    /**
     * 药品规格
     */
    private String specification;

    /**
     * 药品类型(枚举，如处方药)
     */
    private Integer drugType;

    /**
     * 药品分类（枚举，如男科药、神经药）
     */
    private Integer classification;

    /**
     * 药品种类（枚举，如新药、特药）
     */
    private Integer drugKind;

    /**
     * 药品价格
     */
    private BigDecimal price;

}
