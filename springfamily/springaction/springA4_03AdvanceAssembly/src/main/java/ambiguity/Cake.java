package ambiguity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author
 * @Description TODO
 * @date
 */
@Component
@Qualifier("cake111")
public class Cake implements Dessert{
    @Override
    public void say(){
        System.out.println("I'm cake");
    }
}
