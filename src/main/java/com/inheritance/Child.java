package com.inheritance;

public class Child extends Parent {

    Child(){
        //super.show();
        System.out.println("Child Constructor Called");
    }

    public void show(){
        System.out.println("Child Method Called");
    }
}
