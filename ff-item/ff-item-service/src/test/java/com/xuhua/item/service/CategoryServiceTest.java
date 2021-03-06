package com.xuhua.item.service;

import com.xuhua.item.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 14:47 2019/4/30
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryServiceTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void queryCategoryByPid() {
        Category category = categoryService.queryCategoryByPid(325401L);
        System.out.println(category);
    }

    @Test
    public void findAll(){
        List<Category> all = categoryService.findAll();
        System.out.println(all);
    }
}