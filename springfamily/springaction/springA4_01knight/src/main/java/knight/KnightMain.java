package knight;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @Description TODO
 * @date
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
