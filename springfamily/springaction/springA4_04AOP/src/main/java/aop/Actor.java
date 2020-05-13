package aop;

import org.springframework.stereotype.Component;

/**
 * @author
 * @Description TODO
 * @date
 */
@Component
public class Actor implements Performance {

    public Actor() {
    }

    public void perform() {
        System.out.println("我在表演");
    }

    public void performFail() throws Exception {
        System.out.println("表演失败了");
        throw new Exception("表演失败");
    }
}
