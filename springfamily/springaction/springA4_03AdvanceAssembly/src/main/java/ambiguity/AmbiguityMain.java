package ambiguity;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @Description TODO
 * @date
 */
public class AmbiguityMain {



    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AmbiguityConfig.class);
        String[] beanName = applicationContext.getBeanDefinitionNames();
        for (String name: beanName) {
            System.out.println(name);
        }

        applicationContext.close();
    }


}
