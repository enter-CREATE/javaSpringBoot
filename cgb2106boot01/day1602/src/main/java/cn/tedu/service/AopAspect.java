package cn.tedu.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AopAspect {
    @Pointcut("execution( * cn.tedu.service..*.*(..))")
    public void point(){}
    @Around("point()")
    public Object doAround(ProceedingJoinPoint joinPoint)
                            throws Throwable{
        long time = System.currentTimeMillis();//计时开始
        Object o = joinPoint.proceed();
        time = System.currentTimeMillis()-time;//计时结束
        System.out.println("方法执行时间："+time);
        return o;
    }
}
