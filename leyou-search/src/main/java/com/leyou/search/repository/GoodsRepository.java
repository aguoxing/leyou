package com.leyou.search.repository;

import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author guoxing
 * @date 2020/6/25 11:13
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}
