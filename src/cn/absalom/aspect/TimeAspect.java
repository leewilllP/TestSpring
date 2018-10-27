package cn.absalom.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {
    @Around(value = "execution(* cn.absalom.service.ProductService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint)throws Throwable{
        System.out.println("计时开始:"+ joinPoint.getSignature().getName());
        long startTime = System.currentTimeMillis();
        Object object = joinPoint.proceed();
        jdbc.jdbca();
        Thread.sleep(2000);
        long endTime = System.currentTimeMillis();
        System.out.println("耗时:"+ (endTime-startTime));
        return object;
    }
}
