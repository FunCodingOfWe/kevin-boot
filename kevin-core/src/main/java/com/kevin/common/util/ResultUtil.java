package com.kevin.common.util;

import com.kevin.common.entity.Result;
import com.kevin.common.enums.ResultEnum;

/**
 * 返回结果工具类
 *
 * @author kevin
 * @date 2019/7/4 14:08
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(int code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(ResultEnum resultEnum) {
        Result result = new Result();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMsg());
        return result;
    }

    public static Result error(String msg) {
        Result result = new Result();
        result.setCode(ResultEnum.UNKNOW_ERROR.getCode());
        result.setMsg(msg);
        return result;
    }
}
