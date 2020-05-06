package autoconfig;

import autoconfig.config.CDPlayerConfig;
import autoconfig.imp.CDPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author
 * @Description TODO
 * @date
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class AutoConfigTest {

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void cdPlayerNotNull(){
        assertNotNull(cdPlayer);
    }

    @Test
    public void testCDplayer(){
        cdPlayer.play();
    }

}
