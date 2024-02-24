package com.sky.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@Aspect // AOP
public class TimeAspect {

    @Around("execution(* com.sky.service.*.*(..))")
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable{
        // Record the start time
        long begin = System.currentTimeMillis();

        // Call the original method to run
        Object result = joinPoint.proceed();

        // Record end time
        long end = System.currentTimeMillis();
        log.info(joinPoint.getSignature() + "Method spend: {}ms", end - begin);

        return result;
    }
}
