package com.leyou.search.client;

import com.leyou.item.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author guoxing
 * @date 2020/6/25 11:04
 */
@FeignClient(value = "item-service")
public interface SpecificationClient extends SpecificationApi {
}
