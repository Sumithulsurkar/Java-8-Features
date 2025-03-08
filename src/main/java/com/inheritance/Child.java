package com.inheritance;

public class Child extends Parent {

    int a = 5;

    Child(){
        //super.show();
        System.out.println("Child Constructor Called");
        a = 7;
    }

    public void show() {
        int a = 10;
        System.out.println("Child Method Called");
        System.out.println("Value of a is : " + a);
    }
}
