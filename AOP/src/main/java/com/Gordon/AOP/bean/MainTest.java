package com.Gordon.AOP.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainTest {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.Gordon.AOP");
        Perform wemanPerform = (Perform) applicationContext.getBean("wemanPerform");

        if(applicationContext.containsBean("wemanPerform")){
            System.out.println("开始！！！！！！！！！！");
            wemanPerform.ruChang();
            wemanPerform.play();
            wemanPerform.tuiChu();
        }
    }
}
