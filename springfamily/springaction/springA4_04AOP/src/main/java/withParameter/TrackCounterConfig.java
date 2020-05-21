package withParameter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @Description TODO
 * @date
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public BlankDisc blankDisc() {
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setTitle("和自己对话");
        blankDisc.setArtist("林俊杰");
        List<String> tracks = new ArrayList<String>();
        tracks.add("不为谁而作的歌");
        tracks.add("too bad");
        tracks.add("关键词");
        tracks.add("只有要你的地方");
        //...
        blankDisc.setTracks(tracks);
        return blankDisc;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }

}
