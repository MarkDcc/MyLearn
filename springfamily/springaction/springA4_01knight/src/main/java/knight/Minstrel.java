package knight;

import java.io.PrintStream;

/**
 * @author
 * @Description TODO
 * @date
 */
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream){
        this.stream = stream;
    }

    public void signBeforeEmbark(){
        stream.println("Fa la la, the knight is so brave!");
    }

    public void signAfterEmbark(){
        stream.println("Tee hee hee, the brave knight did embark on a quest!");
    }

}
