package com.xuhua.item.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuhua.common.exception.enums.ExceptionEnum;
import com.xuhua.common.exception.myexception.FException;
import com.xuhua.common.vo.PageResult;
import com.xuhua.item.mapper.TagMapper;
import com.xuhua.item.pojo.Tag;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 16:23 2019/4/30
 */

@Service
public class TagService {

    @Autowired
    private TagMapper tagMapper;

    public Tag queryById(Long id){
        Tag tag = tagMapper.selectByPrimaryKey(id);
        return tag;
    }

    public List<Tag> findAll(){
        List<Tag> tags = tagMapper.selectAll();
        return tags;
    }

    public PageResult<Tag> queryTagByPage(Integer page, Integer size, String key) {
        //开启分页
        PageHelper.startPage(page, size);
        //创建过滤条件
        Example example = new Example(Tag.class);
        //创建criteria
        if(StringUtils.isNotBlank(key)){
            example.createCriteria().andLike("name","%"+key+"%");
        }
        List<Tag> tags = tagMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(tags)){
            throw new FException(ExceptionEnum.TAG_NOT_FOUND);
        }

        //对结果进行封装
        PageInfo<Tag> pageInfo = new PageInfo<>(tags);

        return new PageResult<>(pageInfo.getTotal(),tags);
    }
}
