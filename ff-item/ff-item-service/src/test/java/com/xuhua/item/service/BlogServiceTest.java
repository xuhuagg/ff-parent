package com.xuhua.item.service;

import com.xuhua.item.dto.BlogDto;
import com.xuhua.item.pojo.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 12:32 2019/5/2
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class BlogServiceTest {

    @Autowired
    private BlogService blogService;

    @Test
    public void queryById() {
        Blog blog = blogService.queryById(1000L);
        System.out.println(blog);
    }

    @Test
    public void addBlog() {
        Blog blog = new Blog();
        blog.setContent("原子性:即一个操作或者多个操作 要么全部执行并且执行的过程不会被任何因素打断，要么就都不执行。\n" +
                "可见性:当多个线程访问同一个变量时，一个线程修改了这个变量的值，其他线程能够立即看得到修改的值。\n" +
                "有序性:即程序执行的顺序按照代码的先后顺序执行。");
        blog.setCreateTime(new Date());
        blog.setReadSize(0);
        blog.setTitle("并发编程的三个概念");
        blog.setVoteSize(0);
        blog.setUrl("");
        blog.setCategoryId(325406L);
        blog.setUserId(33L);

        List<Long> tagIds = Arrays.asList(1440L,1441L);
        BlogDto blogDto = new BlogDto();
        blogDto.setTagIds(tagIds);

        blogService.addBlog(blog,blogDto);

        System.out.println("done");
    }
}