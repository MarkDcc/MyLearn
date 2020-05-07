package javaconfig.config;


import javaconfig.iml.CDPlayer;
import javaconfig.iml.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 * @Description TODO
 * @date
 */

@Configuration
public class CDPlayerConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new CompactDisc();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
