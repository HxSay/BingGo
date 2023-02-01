package com.tsinghualei.nacosconsumer8083.aoptest;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
@Aspect
public class AopTest {
    @Pointcut("@annotation(com.tsinghualei.nacosconsumer8083.aoptest.AnnotationTest)")
    public void pointCut(){

    }

    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint){
        String methodName = joinPoint.getSignature().getName();
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("ALL - 调用前连接点方法为：" + methodName + ",参数为：" + args);
        for (Object arg:args){
            System.out.println("调用前连接点方法为：" + methodName + ",参数为：" + arg);
            if(arg instanceof Long[]){
                System.out.println("arg");
            }
        }
    }
}
