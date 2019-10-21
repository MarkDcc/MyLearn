package BeanPackage;

//import com.sun.istack.internal.NotNull;
import SpringConfigPack.CDPlayerClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerClass.class)
public class BeanTest {
    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void testBeanAutoWired(){
        assertNotNull(compactDisc);
    }
}
