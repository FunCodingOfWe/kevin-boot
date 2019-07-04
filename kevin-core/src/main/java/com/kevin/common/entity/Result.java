package com.kevin.common.entity;

import lombok.Data;

/**
 * 返回结果封装
 *
 * @author kevin
 * @date 2019/7/4 13:56
 */
@Data
public class Result<T> {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;

}
