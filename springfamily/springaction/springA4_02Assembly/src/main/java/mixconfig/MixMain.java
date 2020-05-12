package mixconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @Description TODO
 * @date
 */
public class MixMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(mixJavaConfig.class);
        School school = (School) applicationContext.getBean("school");
        school.say();
        applicationContext.close();
    }


}
