package com.leyou.user.service;

import com.leyou.user.entity.User;

/**
 * @author guoxing
 * @date 2020/6/27 15:47
 */

public interface UserService {

    /**
     * 校验数据是否可用
     * @param data
     * @param type
     * @return
     */
    Boolean checkData(String data, Integer type);

    /**
     * 发送手机验证码
     * @param phone
     * @return
     */
    Boolean sendVerifyCode(String phone);

    /**
     * 用户注册
     * @param user
     * @param code
     * @return
     */
    Boolean register(User user, String code);

    /**
     * 根据用户名和密码查询用户
     * @param username
     * @param password
     * @return
     */
    User queryUser(String username, String password);
}