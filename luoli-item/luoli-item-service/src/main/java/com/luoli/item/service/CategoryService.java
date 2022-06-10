package com.luoli.item.service;

import com.luoli.item.pojo.Category;

import java.util.List;

/**
 * 商品分类Service
 * @Author liluo
 * @create 2022/6/7 19:23
 */
public interface CategoryService {

    List<Category> queryCategoryByPid(Long pid);

    List<Category> queryCategoryByIds(List<Long> ids);

    List<Category> queryAllByCid3(Long id);
}
