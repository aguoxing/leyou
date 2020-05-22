package com.leyou.item.service;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;

import java.util.List;

/**
 * @author GuoXing
 * @date 2020/5/22 11:17
 */
public interface SpecificationService {
    /**
     * 根据分类id查询分组
     * @param cid
     * @return
     */
    List<SpecGroup> queryGroupsByCid(Long cid);

    List<SpecParam> queryParams(Long gid);
}
