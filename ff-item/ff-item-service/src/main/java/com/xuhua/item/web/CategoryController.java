package com.xuhua.item.web;

import com.xuhua.api.item.CategoryControllerApi;
import com.xuhua.item.pojo.Category;
import com.xuhua.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 15:09 2019/4/30
 */

@RestController
@RequestMapping("category")
public class CategoryController implements CategoryControllerApi {

    @Autowired
    private CategoryService categoryService;

    /**
     * 根据分类ID查询分类
     * @param id
     * @return
     */
    @Override
    @GetMapping("{id}")
    public ResponseEntity<Category> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(categoryService.queryCategoryByPid(id));
    }

    /**
     * 查询所有分类
     * @return
     */
    @Override
    @GetMapping("list")
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.ok(categoryService.findAll());
    }
}
