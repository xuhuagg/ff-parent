package com.xuhua.api.item;

import com.xuhua.item.pojo.Category;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


/**
 * @Author: XuHua
 * @Description: CategoryControllerApi
 * @Date: Created in 22:07 2019/5/1
 */
@Api(value ="微文分类管理接口",description ="微文分类管理接口，提供数据模型的管理、查询接口")
public interface CategoryControllerApi {

    @ApiOperation("根据id查询分类")
    ResponseEntity<Category> queryById(@PathVariable("id") Long id);

    @ApiOperation("根据查询所有分类列表")
    ResponseEntity<List<Category>> findAll();
}
