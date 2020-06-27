package com.leyou.search.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author guoxing
 * @date 2020/6/25 10:52
 */
@FeignClient(value = "item-service")
public interface GoodsClient extends GoodsApi {

}