package com.leyou.item.service;

import com.leyou.common.PageResult;
import com.leyou.item.bo.SpuBO;
import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.SpuDetail;

import java.util.List;

/**
 * @author GuoXing
 * @date 2020/5/26 16:17
 */
public interface GoodsService {
    /**
     * 分页查询
     * @param key
     * @param saleable
     * @param page
     * @param rows
     * @return
     */
    PageResult<SpuBO> querySpuBoByPage(String key, Boolean saleable, Integer page, Integer rows);

    /**
     * 保存
     * @param spuBo
     */
    void saveGoods(SpuBO spuBo);

    /**
     * 根据spuId查询spuDetail
     * @param spuId
     * @return
     */
    SpuDetail querySpuDetailBySpuId(Long spuId);

    /**
     * 根据spuId查询sku的集合
     * @param spuId
     * @return
     */
    List<Sku> querySkusBySpuId(Long spuId);
}
