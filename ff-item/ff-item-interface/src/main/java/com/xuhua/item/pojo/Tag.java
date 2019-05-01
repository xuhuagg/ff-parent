package com.xuhua.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: XuHua
 * @Description: tag类
 * @Date: Created in 16:13 2019/4/30
 */

@Data
@Table(name = "tb_tag")
public class Tag {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
    private String categoryId;
    private int sort;
}
