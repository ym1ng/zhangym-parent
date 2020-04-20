package com.zhangym.exception;

/**
 * 自定义异常----参数异常
 *
 * @author zym
 * @create 2020-04-14 8:39
 **/
public class ParamJsonException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public ParamJsonException() {}

    public ParamJsonException(String message) {
        super(message);
        this.message = message;
    }


}

