package com.xuhua.item.service;

import com.xuhua.common.vo.PageResult;
import com.xuhua.item.pojo.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 16:25 2019/4/30
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class TagServiceTest {

    @Autowired
    private TagService service;

    @Test
    public void queryById() {
        Tag tag = service.queryById(1425L);
        System.out.println(tag);
    }

    @Test
    public void findAll(){
        List<Tag> all = service.findAll();
        System.out.println(all);
    }

    @Test
    public void findByPage(){
        PageResult<Tag> result = service.queryTagByPage(2, 5, "");
        System.out.println(result.getTotal());
    }

    @Test
    public void queryByCategoryId() {
        List<Tag> tags = service.queryByCategoryId(325401L);
        System.out.println(tags.size());
    }
}