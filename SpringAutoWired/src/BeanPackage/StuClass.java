package BeanPackage;

import org.springframework.beans.factory.annotation.Autowired;

public class StuClass {
    private String className;
    private Student student;

    public StuClass(Student student){
        this.className = student.myName();
        this.student = student;
    }

    public void myClass(){
        System.out.println("ClassName" + this.className + "StudentName" + this.student.myName());
    }
}
