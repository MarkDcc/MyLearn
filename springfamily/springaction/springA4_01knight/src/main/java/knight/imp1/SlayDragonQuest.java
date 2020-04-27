package knight.imp1;

import knight.Quest;

import java.io.PrintStream;

/**
 * @author
 * @Description TODO
 * @date
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream printStream){
        this.stream = printStream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
