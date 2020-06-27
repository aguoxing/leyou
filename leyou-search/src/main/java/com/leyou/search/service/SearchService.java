package com.leyou.search.service;

import com.leyou.item.pojo.Spu;
import com.leyou.search.pojo.Goods;

/**
 * @author guoxing
 * @date 2020/6/25 11:31
 */
public interface SearchService {

    /**
     * 把Spu转为Goods
     * @param spu
     * @return
     */
    Goods buildGoods(Spu spu);
}
