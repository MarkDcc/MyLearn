package SpringConfigPack;

import BeanPackage.StuClass;
import BeanPackage.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config.xml")
public class StuClassConfig {

    @Bean
    public StuClass StuClass(Student student){
        return new StuClass(student);
    }

}
