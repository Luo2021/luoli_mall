package com.luoli.item.web;

import com.luoli.item.pojo.Category;
import com.luoli.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品类别Controller
 * @Author liluo
 * @create 2022/6/7 19:23
 */
@RestController
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 根据父类ID查询分类结果
     * @param pid
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<Category>> queryCategoryByPid(@RequestParam(value = "pid",defaultValue = "0") Long pid) {
        List<Category> categoryList = categoryService.queryCategoryByPid(pid);
        return ResponseEntity.ok(categoryList);
    }
}
