package com.leyou.search.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author guoxing
 * @date 2020/6/25 11:03
 */
@FeignClient(value = "item-service")
public interface BrandClient extends BrandApi {
}
