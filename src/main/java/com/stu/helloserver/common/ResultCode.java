package com.stu.helloserver.common;
/**
 * 响应状态码枚举（文档要求：新增用户相关状态码）
 */
public enum ResultCode {
    // 通用状态码
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),

    // 文档要求：用户业务状态码
    USER_HAS_EXISTED(4001, "用户名已存在"),
    USER_NOT_EXIST(4002, "用户不存在"),
    PASSWORD_ERROR(4003, "密码错误");

    private Integer code;
    private String msg;

    ResultCode(Integer code, String msg) {
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