package BeanPackage;

import java.security.PrivateKey;

public class Student {
    private String calssName;

    public Student(String calssName){
        this.calssName = calssName;
    }

    public void setClassName(String calssName) {
        this.calssName = calssName;
    }

    public String myName(){
        System.out.println("Name" + this.calssName);
        return this.calssName;
    }
}
