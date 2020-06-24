package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author GuoXing
 * @date 2020/5/26 16:53
 */
@Data
@Table(name = "tb_sku")
public class Sku {
    /**
     * sku id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Long id;

    /**
     * spu id
     */
    @Column(name = "spu_id")
    private Long spuId;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品的图片，多个图片以‘,’分割
     */
    private String images;

    /**
     * 销售价格，单位为分
     */
    private Long price;

    /**
     * 特有规格属性在spu属性模板中的对应下标组合
     */
    private String indexes;

    /**
     * sku的特有规格参数键值对，json格式，反序列化时请使用linkedHashMap，保证有序
     */
    @Column(name = "own_spec")
    private String ownSpec;

    /**
     * 是否有效，0无效，1有效
     */
    private Boolean enable;

    /**
     * 添加时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @Column(name = "last_update_time")
    private Date lastUpdateTime;

    /**
     * 库存
     * Transient注解：临时变量，不会持久化到数据库
     */
    @Transient
    private Integer stock;
}
