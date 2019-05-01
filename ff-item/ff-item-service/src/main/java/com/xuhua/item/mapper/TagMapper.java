package com.xuhua.item.mapper;

import com.xuhua.item.pojo.Tag;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author: XuHua
 * @Description: TagMapper
 * @Date: Created in 16:21 2019/4/30
 */
public interface TagMapper extends Mapper<Tag>,IdListMapper<Tag,Long> {
}
