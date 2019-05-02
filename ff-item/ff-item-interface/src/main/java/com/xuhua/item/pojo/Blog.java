package com.xuhua.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author: XuHua
 * @Description: Blog类
 * @Date: Created in 11:55 2019/5/2
 */

@Data
@Table(name = "tb_blog")
public class Blog {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String content;
    private Date createTime;
    private Integer readSize;
    private String title;
    private Integer voteSize;
    private String url;
    private Long categoryId;
    private Long userId;
}
