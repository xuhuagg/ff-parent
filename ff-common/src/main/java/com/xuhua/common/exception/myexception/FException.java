package com.xuhua.common.exception.myexception;

import com.xuhua.common.exception.enums.ExceptionEnum;
import lombok.Getter;

/**
 * @Author: XuHua
 * @Description: 通用异常处理类
 * @Date: Created in 12:03 2019/4/30
 */
@Getter
public class FException  extends RuntimeException {

    private ExceptionEnum exceptionEnum;

    public FException(String message, ExceptionEnum exceptionEnum) {
        super(message);
        this.exceptionEnum = exceptionEnum;
    }
}
