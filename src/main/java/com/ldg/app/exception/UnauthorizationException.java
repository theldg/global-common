package com.ldg.app.exception;

/**
 * 授权失败异常
 *
 * @author ldg
 */
public class UnauthorizationException extends Exception {

    public UnauthorizationException(String message) {
        //设置父类的message
        super(message);
    }
}
