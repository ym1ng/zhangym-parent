package com.zhangym.exception;

/**
 * 身份异常
 *
 * @author zym
 * @create 2020-04-14 10:10
 **/
public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String msg) {
        super(msg);
    }

    public UnauthorizedException() {
        super();
    }
}
