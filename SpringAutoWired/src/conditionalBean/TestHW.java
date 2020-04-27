package conditionalBean;

import SpringConfigPack.HWConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Iterator;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HWConfig.class)
@ActiveProfiles("test")
public class TestHW {

    @Autowired
    Wife wife;
    @Autowired
    Husband husband;

    @Test
    public void test01(){

        ConfigurableListableBeanFactory clb = new DefaultListableBeanFactory();

        //TODO add getbean method
        assertNotNull(wife);
        System.out.println(wife);
        Iterator iterator = clb.getBeanNamesIterator();
        if(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        if(clb.getBean("wife") != null){
//            System.out.println(clb.getBean("husband"));
//            Husband husband = (Husband) clb.getBean("husband");
//            husband.laugh();
//        }else {
//            System.out.println("Husband is null");
//        }

    }
}
