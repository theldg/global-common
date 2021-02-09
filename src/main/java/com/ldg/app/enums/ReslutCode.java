package com.ldg.app.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ldg
 */
@Getter
@AllArgsConstructor
public enum ReslutCode {
    /**
     * 请求响应成功
     */
    Ok(200, "成功响应"),
    /**
     * 请求没有被认证
     */
    Unauthorized(401, "认证失败"),
    /**
     * 请求被禁止
     */
    Forbidden(403, "禁止访问"),
    /**
     * 请求资源不存在
     */
    NotFound(404, "资源不存在"),
    /**
     * 服务器出现异常
     */
    ServerException(500, "服务器异常"),

    /**
     *
     */
    BadRequest(400, "请求不合法");
    private Integer code;
    private String msg;

}
