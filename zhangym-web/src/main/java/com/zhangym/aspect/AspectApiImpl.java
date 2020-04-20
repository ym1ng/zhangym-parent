package com.zhangym.aspect;

import com.zhangym.base.Constant;
import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 * 装饰模式
 *
 * @author zym
 * @create 2020-04-14 8:32
 **/
public class AspectApiImpl implements AspectApi {

    @Override
    public Object doHandlerAspect(ProceedingJoinPoint pjp, Method method) throws Throwable {
        Constant.isPass=false;
        return null;
    }
}
