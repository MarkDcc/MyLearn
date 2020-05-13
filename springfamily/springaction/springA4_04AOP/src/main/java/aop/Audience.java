package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

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

    //通知
    @Before("perform()")
    public void silenceCellPhone(){
        System.out.println("关闭手机");
    }

}
