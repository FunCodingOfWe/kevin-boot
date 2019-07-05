package com.kevin.common.exception;

import com.kevin.common.entity.Result;
import com.kevin.common.enums.ResultEnum;
import com.kevin.common.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.List;

/**
 * 异常处理器
 *
 * @author kevin
 * @date 2019/7/4 14:46
 */
@RestControllerAdvice
@Slf4j
public class KevinExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e) {
        log.error(e.getMessage(), e);

        if (e instanceof KevinException) {
            return ResultUtil.error(e.getMessage());
        } else if (e instanceof NoHandlerFoundException) {
            return ResultUtil.error(ResultEnum.NO_HANDLER_FOUND_ERROR);
        } else if (e instanceof IllegalArgumentException) {
            return ResultUtil.error(e.getMessage());
        } else if (e instanceof IllegalStateException) {
            return ResultUtil.error(e.getMessage());
        } else if (e instanceof BindException) {
            BindException ex = (BindException) e;
            List<ObjectError> allErrors = ex.getAllErrors();
            ObjectError error = allErrors.get(0);
            String defaultMessage = error.getDefaultMessage();
            return ResultUtil.error(defaultMessage);
        } else if (e instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException ex = (MethodArgumentNotValidException) e;
            List<ObjectError> errors = ex.getBindingResult().getAllErrors();
            String message = errors.get(0).getDefaultMessage();
            return ResultUtil.error(message);
        } else {
            return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
        }
    }
}
