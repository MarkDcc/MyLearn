package javaconfig.iml;

/**
 * @author
 * @Description TODO
 * @date
 */
public class CDPlayer {


    private CompactDisc compactDisc;

    public CDPlayer() {
    }
    //构造器注入
    public CDPlayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    public void perform(){
        compactDisc.play();
    }
}
