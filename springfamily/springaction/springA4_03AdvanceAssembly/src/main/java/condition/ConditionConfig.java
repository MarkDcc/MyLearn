package condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @author
 * @Description TODO
 * @date
 */
public class ConditionConfig {

    @Bean
    @Conditional(SchoolCondition.class)
    public School generateSchool(){
        return new School();
    }
}
