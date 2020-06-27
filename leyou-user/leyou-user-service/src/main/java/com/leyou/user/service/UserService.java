package com.leyou.user.service;

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
}