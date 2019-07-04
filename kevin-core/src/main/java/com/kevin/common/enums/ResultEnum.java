package com.kevin.common.enums;

/**
 * 返回结果枚举类
 *
 * @author kevin
 * @date 2019/7/4 14:10
 */
public enum ResultEnum {
    UNKNOW_ERROR(500, "未知异常，请联系管理员"),
    SUCCESS(0, "成功");



    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }
}
