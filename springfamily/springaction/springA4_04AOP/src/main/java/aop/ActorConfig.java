package aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author
 * @Description TODO
 * @date
 */

@Configuration
@ComponentScan(basePackages = "aop")
@EnableAspectJAutoProxy
public class ActorConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }
}
