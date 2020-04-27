package com.Gordon.AOP.bean;

import org.springframework.stereotype.Component;

@Component
public class WemanPerform implements Perform {


    public void play() {
        System.out.println("Weman play.");
    }

    public void ruChang() {
        System.out.println("Weman ruChang");
    }


    public void tuiChu() {
        System.out.println("Weman tuiChu");
    }
}
