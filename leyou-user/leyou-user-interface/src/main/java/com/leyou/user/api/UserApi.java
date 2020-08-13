package com.leyou.user.api;

import com.leyou.user.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guoxing
 * @date 2020/6/29 10:33
 */
public interface UserApi {

    @GetMapping("query")
    public User queryUser(
            @RequestParam("username") String username,
            @RequestParam("password") String password);

}
