package com.leyou.item.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author GuoXing
 * @date 2020/5/26 16:53
 */
@Data
@Table(name = "tb_stock")
public class Stock {
    /**
     * 库存对应的商品sku id
     */
    @Id
    @Column(name = "sku_id")
    private Long skuId;

    /**
     * 可秒杀库存
     */
    @Column(name = "seckill_stock")
    private Integer seckillStock;

    /**
     * 秒杀总数量
     */
    @Column(name = "seckill_total")
    private Integer seckillTotal;

    /**
     * 库存数量
     */
    private Integer stock;
}
