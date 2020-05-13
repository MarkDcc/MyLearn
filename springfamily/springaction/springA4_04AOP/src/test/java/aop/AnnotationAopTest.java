package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author
 * @Description TODO
 * @date
 */
@ContextConfiguration(classes = ActorConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AnnotationAopTest {

    @Autowired
    //@Qualifier("actor")
    private Performance actor;

    @Test
    public void testAop(){
        actor.perform();
    }
}
