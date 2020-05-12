package mixconfig;

/**
 * @author
 * @Description TODO
 * @date
 */
public class School {

    private StudentA studentA;
    private StudentB studentB;
    private StudentC studentC;

    public School(StudentA studentA, StudentB studentB,StudentC studentC){
        this.studentA = studentA;
        this.studentB = studentB;
        this.studentC = studentC;
    }

    public School() {
    }

    public void say(){
        this.studentA.say();
        this.studentB.say();
        this.studentC.say();
    }
}
