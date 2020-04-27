package conditionalBean;

import SpringConfigPack.HWConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import javax.swing.*;
import java.util.Iterator;
//@ActiveProfiles("test")
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HWConfig.class);
//        MainClass mainClass = new MainClass(husband,wife);
        if(ctx.containsBean("wife")){
//            System.out.println(clb.getBean("husband"));
//            Husband husband = (Husband) clb.getBean("husband");

            Husband husband = (Husband) ctx.getAutowireCapableBeanFactory().getBean("husband");
            husband.laugh();
        }else {
            System.out.println("Husband is null");
        }

        }
}
