package BeanPackage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sgtPeppers")//bean id 默认为类名第一个字母小写
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt.    Papper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    private Images images;
    @Override
    public void player() {
        System.out.println("Playing" + title + " by " + artist);
        images.name();
    }

    @Autowired
    // @Qualifier(value = "images")不可以用在constructor上面
    public SgtPeppers(Images images){
        this.images = images;
    }
}
