package withParameter;

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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class WithParameterTest {
    @Autowired
    private BlankDisc blankDisc;

    @Autowired
    TrackCounter trackCounter;

    @Test
    public void testCount(){
        blankDisc.playTrack(2);
        blankDisc.playTrack(3);
        blankDisc.playTrack(3);

//        blankDisc.playTrack(2);
//        blankDisc.playTrack(3);
        System.out.println(trackCounter.responseCount());
    }

}
