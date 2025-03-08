package com.inheritance;

public class Parent1 {

    public void run() {
        walk();
        System.out.println("Parent run");
    }

    public void walk() {
        System.out.println("Parent walk");
    }
}

class Child1 extends Parent1 {

    public void run() {
        super.run();
        System.out.println("child run");
    }

    public void walk() {
        super.walk();
        System.out.println("child walk");
    }
}
