package com.xuhua.item.mapper;

import com.xuhua.item.pojo.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 12:20 2019/5/2
 */
public interface BlogMapper extends Mapper<Blog>, IdListMapper<Blog, Long> {

    @Insert("insert into tb_blog_tag (blog_id, tag_id) values (#{blogId}, #{tagId})")
    int saveBlogTag(@Param("blogId") Long blogId, @Param("tagId") Long tagId);
}
