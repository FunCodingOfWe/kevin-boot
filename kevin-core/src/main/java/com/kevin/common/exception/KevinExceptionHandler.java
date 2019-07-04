package com.kevin.common.exception;

import com.kevin.common.entity.Result;
import com.kevin.common.enums.ResultEnum;
import com.kevin.common.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 *
 * @author kevin
 * @date 2019/7/4 14:46
 */
@RestControllerAdvice
@Slf4j
public class KevinExceptionHandler {

    /**
     * 自定义异常
     */
    @ExceptionHandler(KevinException.class)
    public Result handleRRException(KevinException e){
        return ResultUtil.error(e.getCode(),e.getMsg());
    }



    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        log.error(e.getMessage(), e);
        return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
    }
}
