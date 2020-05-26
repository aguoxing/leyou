package com.leyou.item.service;

import com.leyou.common.PageResult;
import com.leyou.item.pojo.Brand;

import java.util.List;

/**
 * @author GuoXing
 * @date 2020/5/21 10:55
 */
public interface BrandService {
    /**
     * 根据查询条件分页并排序查询品牌信息
     * @param key
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @return
     */
    PageResult<Brand> queryBrandsByPage(String key, Integer page, Integer rows, String sortBy, Boolean desc);

    /**
     * 新增商品分类
     * @param brand
     * @param cids
     */
    void saveBrand(Brand brand, List<Long> cids);

    /**
     * 根据商品分类id，查询对应品牌
     * @param cid
     * @return
     */
    List<Brand> queryBrandsByCid(Long cid);
}
