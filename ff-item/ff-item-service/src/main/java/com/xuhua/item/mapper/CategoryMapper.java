package com.xuhua.item.mapper;

import com.xuhua.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 13:12 2019/4/30
 */
public interface CategoryMapper extends Mapper<Category>, IdListMapper<Category, Long> {
}
