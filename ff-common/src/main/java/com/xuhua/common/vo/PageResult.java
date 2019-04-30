package com.xuhua.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author: XuHua
 * @Description: 分页结果类
 * @Date: Created in 12:06 2019/4/30
 */
@Data
public class PageResult<T> {

    private Long total;
    private Integer totalPage;
    private List<T> items;

    public PageResult() {
    }

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

    public PageResult(Long total, Integer totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}
