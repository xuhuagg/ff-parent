package com.xuhua.item.service;

import com.xuhua.common.exception.enums.ExceptionEnum;
import com.xuhua.common.exception.myexception.FException;
import com.xuhua.item.mapper.CategoryMapper;
import com.xuhua.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Author: XuHua
 * @Description: category service
 * @Date: Created in 13:14 2019/4/30
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public Category queryCategoryByPid(Long pid) {
        Category category = new Category();
        category.setId(pid);
        Category select = categoryMapper.selectByPrimaryKey(category);
        if (select==null){
            throw new FException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return select;
    }

    public List<Category> findAll(){
        List<Category> categories = categoryMapper.selectAll();
        if(CollectionUtils.isEmpty(categories)){
            throw new FException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }

        return categories;
    }

}
