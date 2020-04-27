package com.Gordon.AOP.bean;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ManAudience implements Audience {
    @Pointcut("execution(* com.Gordon.AOP.bean.Perform.ruChang(..))")
    public void ruChang(){};


    @Before("ruChang()")
    public void applause() {
        System.out.println("看见演员入场，鼓掌");
    }


    public void watchPerform() {
        System.out.println("演员表演时，观看表演");
    }
}
