package com.kevin.common.exception;

import com.kevin.common.enums.ResultEnum;

/**
 * 自定义异常
 */
public class KevinException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String msg;

    private int code = 500;

    public KevinException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public KevinException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.msg = resultEnum.getMsg();
        this.code = resultEnum.getCode();
    }

    public KevinException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public KevinException(ResultEnum resultEnum, Throwable e) {
        super(resultEnum.getMsg(), e);
        this.msg = resultEnum.getMsg();
        this.code = resultEnum.getCode();
    }

    public KevinException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }


    public KevinException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
