package com.amanv;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop constructor..");
    }

    @Override
    public void compile() {
        System.out.println("Compiling in Desktop....");
    }
}
