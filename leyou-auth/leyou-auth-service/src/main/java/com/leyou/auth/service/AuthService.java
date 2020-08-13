package com.leyou.auth.service;

/**
 * @author guoxing
 * @date 2020/6/29 10:29
 */
public interface AuthService {

    /**
     * 鉴权
     * @param username
     * @param password
     * @return
     */
    String authentication(String username, String password);
}
