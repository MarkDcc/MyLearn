package javaconfig;


import javaconfig.config.CDPlayerConfig;
import javaconfig.iml.CDPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author
 * @Description TODO
 * @date
 */
public class JavaConfigMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDPlayer cdPlayer = (CDPlayer) applicationContext.getBean("cdPlayer");
        cdPlayer.perform();
        applicationContext.close();
    }

}
