package mixconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author
 * @Description TODO
 * @date
 */
@Configuration
@ComponentScan
@ImportResource("classpath:application.xml")
public class mixJavaConfig {

    @Bean
    public StudentB studentB(){
        return new StudentB();
    }

    @Bean
    public School school(StudentA studentA,StudentB studentB,StudentC studentC){
        return new School(studentA,studentB,studentC);
    }
}
