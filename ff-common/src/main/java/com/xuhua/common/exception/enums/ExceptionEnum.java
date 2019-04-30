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

    BRAND_CREATE_FAILED(500, "新增品牌失败"),


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
