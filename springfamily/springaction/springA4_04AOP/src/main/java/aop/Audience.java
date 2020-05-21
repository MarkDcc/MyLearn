package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author
 * @Description TODO
 * @date
 */
@Aspect
public class Audience {
    //定义重用切点
    @Pointcut("execution(* aop.Actor.perform(..))")
    public void perform(){};

    @Before("perform()")
    public void silence(){
        System.out.println("前置通知2");
    }
    //通知
    @Before("perform()")
    public void silenceCellPhone(){
        System.out.println("关闭手机");
    }


    @After("perform()")
    public void applause(){
        System.out.println("鼓掌鼓掌");
    }

    @Around("perform()")
    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("我是前置通知");
        try {
            joinPoint.proceed();
            System.out.println("我是后置通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
