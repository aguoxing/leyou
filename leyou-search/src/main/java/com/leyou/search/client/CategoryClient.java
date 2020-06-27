package com.leyou.search.client;

import com.leyou.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author guoxing
 * @date 2020/6/25 11:02
 */
@FeignClient(value = "item-service")
public interface CategoryClient extends CategoryApi {
}
