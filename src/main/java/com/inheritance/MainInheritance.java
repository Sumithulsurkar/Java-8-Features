package com.inheritance;

public class MainInheritance {

    public static void main(String[] args) {

        Child ch = new Child();
        ch.show(); // child's method will be invoked

        Parent p = new Parent();
        p.show(); // Parent's method will be invoked


        //Parent Constructor Called
        //Child Constructor Called
        //Child Method Called
    }
}
