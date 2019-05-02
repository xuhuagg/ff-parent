package com.xuhua.item.web;

import com.xuhua.api.item.BlogControllerApi;
import com.xuhua.item.pojo.Blog;
import com.xuhua.item.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 12:39 2019/5/2
 */
@RestController
@RequestMapping("blog")
public class BlogController implements BlogControllerApi {

    @Autowired
    private BlogService blogService;

    @Override
    @GetMapping("{id}")
    public ResponseEntity<Blog> queryById(@PathVariable("id") Long id){
        return ResponseEntity.ok(blogService.queryById(id));
    }

}
