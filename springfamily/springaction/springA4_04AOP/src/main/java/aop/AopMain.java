package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @Description TODO
 * @date
 */
public class AopMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ActorConfig.class);
        //spring AOP 是基于动态代理的，仅支持接口。
        Performance actor = (Performance) applicationContext.getBean(Performance.class);
        actor.perform();
//        for (String name : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
        applicationContext.close();

    }
}
