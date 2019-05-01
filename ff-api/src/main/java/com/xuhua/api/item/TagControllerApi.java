package com.xuhua.api.item;

import com.xuhua.common.vo.PageResult;
import com.xuhua.item.pojo.Tag;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 22:46 2019/5/1
 */
@Api(value ="微文标签管理接口",description ="微文标签管理接口，提供数据模型的管理、查询接口")
public interface TagControllerApi {

    @ApiOperation("根据id查询标签")
    ResponseEntity<Tag> queryById(@PathVariable("id") Long id);

    @ApiOperation("查询所有分类")
    ResponseEntity<List<Tag>> findAll();

    @ApiOperation("分页查询页面列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name="page",value ="页" +
                    "码",required=true,paramType="path",dataType="int"),
            @ApiImplicitParam(name="size",value ="每页记录" +
                    "数",required=true,paramType="path",dataType="int")
    })
    ResponseEntity<PageResult<Tag>> queryTagByPage(@PathVariable("page") int page,
                                                   @PathVariable("size") int size,
                                                   String key);
}
