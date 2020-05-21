package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @author GuoXing
 * @date 2020/5/20 15:42
 */
public interface CategoryService {
    List<Category> queryCategoriesByPid(Long pid);
}
