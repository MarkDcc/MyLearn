package SpringConfigPack;

import conditionalBean.Husband;
import conditionalBean.HusbandCondition;
import conditionalBean.Wife;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"conditionalBean"})
public class HWConfig {

    @Bean
   @Profile("test")
    public Wife wife(){
        System.out.println("创建wife");
        return new Wife();
    }

    @Bean
   @Conditional(HusbandCondition.class)
    public Husband husband(){
        System.out.println("创建husband");
        return new Husband();
    }
}
