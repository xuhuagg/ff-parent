package com.xuhua.api.item;

import com.xuhua.item.pojo.Blog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 12:41 2019/5/2
 */
@Api(value ="微文管理接口",description ="微文管理接口，提供数据模型的管理、查询接口")
public interface BlogControllerApi {
    @ApiOperation("根据id查询微文")
    ResponseEntity<Blog> queryById(@PathVariable("id") Long id);
}
