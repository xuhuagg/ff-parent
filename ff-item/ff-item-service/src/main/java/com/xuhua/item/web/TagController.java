package com.xuhua.item.web;

import com.xuhua.api.item.TagControllerApi;
import com.xuhua.common.vo.PageResult;
import com.xuhua.item.pojo.Tag;
import com.xuhua.item.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: XuHua
 * @Description:
 * @Date: Created in 16:29 2019/4/30
 */

@RestController
@RequestMapping("tag")
public class TagController implements TagControllerApi {

    @Autowired
    private TagService tagService;

    @Override
    @GetMapping("{id}")
    public ResponseEntity<Tag> queryById(@PathVariable("id") Long id){
        return ResponseEntity.ok(tagService.queryById(id));
    }

    @Override
    @GetMapping("list")
    public ResponseEntity<List<Tag>> findAll(){
        return ResponseEntity.ok(tagService.findAll());
    }

    @Override
    @GetMapping("/list/{page}/{size}")
    public ResponseEntity<PageResult<Tag>> queryTagByPage(@PathVariable("page") int page,
                                                          @PathVariable("size") int size,
                                                          @RequestParam("key") String key
    ) {
        return ResponseEntity.ok(tagService.queryTagByPage(page, size, key));
    }
}
