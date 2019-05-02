package com.xuhua.item.service;

import com.xuhua.common.exception.enums.ExceptionEnum;
import com.xuhua.common.exception.myexception.FException;
import com.xuhua.item.dto.BlogDto;
import com.xuhua.item.mapper.BlogMapper;
import com.xuhua.item.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 12:24 2019/5/2
 */
@Service
public class BlogService {

    @Autowired
    private BlogMapper blogMapper;

    public Blog queryById(Long id) {
        Blog blog = blogMapper.selectByPrimaryKey(id);
        if (blog == null) {
            throw new FException(ExceptionEnum.BLOG_NOT_FOUND);
        }
        return blog;
    }

    public void addBlog(Blog blog, BlogDto blogDto) {
        blog.setId(null);
        int count = blogMapper.insertSelective(blog);
        if (count != 1) {
            throw new FException(ExceptionEnum.BLOG_CREATE_FAILED);
        }
        for (Long tagId : blogDto.getTagIds()) {
            count = blogMapper.saveBlogTag(blog.getId(), tagId);
            if (count != 1) {
                throw new FException(ExceptionEnum.BLOG_TAG_CREATE_FAILED);
            }
        }
    }
}
