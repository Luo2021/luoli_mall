package com.luoli.item.mapper;

import com.luoli.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * 商品分类Mapper
 * @Author liluo
 * @create 2022/6/7 20:21
 */
public interface CategoryMapper  extends Mapper<Category>, IdListMapper<Category, Long> {
}
