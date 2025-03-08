package com.inheritance;

class ParentChildCheck {
    public static void main(String[] a) {   //Parent walk Parent run child run
        Parent1 p1 = new Child1();
        p1.run();
    }
}