package cn.absalom.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/*
* 该日志切面的功能是 在调用核心功能之前和之后分别打印日志
* */

public class LoggerAspect {
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("start log:"+ joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:"+joinPoint.getSignature().getName());
        return object;
    }
}
