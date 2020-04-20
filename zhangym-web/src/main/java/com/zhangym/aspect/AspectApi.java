package com.zhangym.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 *  装饰器模式
 * @author zym
 * @create 2020-04-14 8:29
 **/
public interface AspectApi {
    Object doHandlerAspect(ProceedingJoinPoint pjp, Method method)throws Throwable;
}
