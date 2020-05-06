package autoconfig.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author
 * @Description TODO
 * @date
 */
@Component
public class CDPlayer implements CompactDisc {

    @Autowired
    private CompactDisc compactDisc;

    public void play() {
        compactDisc.play();
    }
}
