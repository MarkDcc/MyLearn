package ambiguity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author
 * @Description TODO
 * @date
 */
@Component
@Qualifier("testPosicle")
public class Popsicle implements Dessert {

    @Override
    public void say() {
        System.out.println("I'm Popsicle");
    }
}
