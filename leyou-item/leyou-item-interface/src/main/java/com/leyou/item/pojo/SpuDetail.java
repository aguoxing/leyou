package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author GuoXing
 * @date 2020/5/26 16:16
 */
@Data
@Table(name = "tb_spu_detail")
public class SpuDetail {
    @Id
    @Column(name = "spu_id")
    private Long spuId;

    /**
     * 通用规格参数数据
     */
    @Column(name = "generic_spec")
    private String genericSpec;

    /**
     * 特有规格参数及可选值信息，json格式
     */
    @Column(name = "special_spec")
    private String specialSpec;

    /**
     * 包装清单
     */
    @Column(name = "packing_list")
    private String packingList;

    /**
     * 售后服务
     */
    @Column(name = "after_service")
    private String afterService;

    /**
     * 商品描述信息
     */
    private String description;
}
