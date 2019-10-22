package BeanPackage;

import SpringConfigPack.StuClassConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = StuClassConfig.class)
public class StuTest {
    private Student student;

    @Autowired
    private StuClass stuClass;

    @Test
    public void  test(){

        stuClass.myClass();
    }
}
