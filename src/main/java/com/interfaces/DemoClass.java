package com.interfaces;

public class DemoClass {

    void getData(){
        I1.staticMethodOfInterface();
    }

    static void staticMethodOfInterface(){
        System.out.println("IN CLASS -> Now in staticMethodOfInterface of class");
    }

    public static void main(String[] args) {
        DemoClass d = new DemoClass();
        d.getData();
        d.staticMethodOfInterface();
        DemoClass.staticMethodOfInterface();
    }
}
