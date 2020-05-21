package withParameter;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;

/**
 * @author
 * @Description TODO
 * @date
 */
@Aspect
public class TrackCounter {
    HashMap<Integer,Integer> titleAndNum = new HashMap();
    @Pointcut("execution(* withParameter.BlankDisc.playTrack(int))"+"&& args(trackNum)")
    public void track(int trackNum){};

    @Before("track(trackNum)")
    public void countTrackNum(int trackNum){
        int count = countAdd(trackNum);
        titleAndNum.put(trackNum,count+1);
    }

    public int countAdd(int trackNum){
        return titleAndNum.containsKey(trackNum)?titleAndNum.get(trackNum):0;
    }

    public HashMap<Integer,Integer> responseCount(){
        return titleAndNum;
    }
}
