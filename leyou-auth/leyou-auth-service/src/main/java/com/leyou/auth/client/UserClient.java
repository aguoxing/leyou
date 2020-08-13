package com.leyou.auth.client;

import com.leyou.user.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author guoxing
 * @date 2020/6/29 10:36
 */
@FeignClient(value = "user-service")
public interface UserClient extends UserApi {
}