package com.xuhua.common.vo;

import com.xuhua.common.exception.enums.ExceptionEnum;
import lombok.Data;

/**
 * @Author: XuHua
 * @Description: 异常结果类
 * @Date: Created in 12:06 2019/4/30
 */
@Data
public class ExceptionResult {

    private int status;

    private String message;

    private long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.value();
        this.message = em.message();
        this.timestamp = System.currentTimeMillis();
    }
}