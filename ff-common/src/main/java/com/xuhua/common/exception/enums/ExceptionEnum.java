package com.xuhua.common.exception.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: XuHua
 * @Description: 异常枚举类
 * @Date: Created in 12:05 2019/4/30
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
public enum ExceptionEnum {

    CATEGORY_NOT_FOUND(204, "分类不存在"),
    TAG_NOT_FOUND(204,"标签不存在"),
    BLOG_NOT_FOUND(204,"微文不存在"),
    BLOG_CREATE_FAILED(500, "微文创建失败"),
    BLOG_TAG_CREATE_FAILED(500, "微文标签表新建错误"),
    ;
    int value;
    String message;

    public int value() {
        return this.value;
    }

    public String message() {
        return this.message;
    }

}
