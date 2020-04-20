package com.zhangym.base;

/**
 * 业务异常类
 * @author zym
 * @create 2020-04-13 16:00
 **/
public class BusinessException extends Exception{

    private static final long serialVersionUID = 3455708526465670030L;

    public BusinessException(String msg){
        super(msg);
    }
}