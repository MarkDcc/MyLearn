package autoconfig;

import autoconfig.config.CDPlayerConfig;
import autoconfig.imp.CompactDisc;
import autoconfig.imp.SgtPeppers;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @Description TODO
 * @date
 */
public class AutoMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        //System.out.printf(String.valueOf(applicationContext.getBeanDefinitionNames()));
        String[] BeanName = applicationContext.getBeanDefinitionNames();
        System.out.println(BeanName.length);
        for (String name:BeanName) {
            //类名如果短类名长度大于1，且第一个和第二个字符为大写，则直接返回短类名
            //其他情况下将短类名首字符小写后返回，假设类为com.test.Student，则beanName为student
            System.out.println(name);
        }
        CompactDisc compactDisc = applicationContext.getBean(SgtPeppers.class);
        

        compactDisc.play();
        applicationContext.close();
    }
}
