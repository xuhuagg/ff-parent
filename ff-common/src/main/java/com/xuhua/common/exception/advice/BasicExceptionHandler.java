package com.xuhua.common.exception.advice;

import com.xuhua.common.exception.myexception.FException;
import com.xuhua.common.vo.ExceptionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: XuHua
 * @Description: 异常处理类
 * @Date: Created in 12:08 2019/4/30
 */
@Slf4j
@ControllerAdvice
public class BasicExceptionHandler {

    @ExceptionHandler(FException.class)
    @ResponseBody
    public ResponseEntity<ExceptionResult> handleException(FException e) {
        return ResponseEntity.status(e.getExceptionEnum().value())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}