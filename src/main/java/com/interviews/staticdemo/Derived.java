package com.interviews.staticdemo;

public class Derived extends StaticOverriding {

    // This method is hidden by display() in Base
    public static void display() {
        System.out.println("Static or class method from Derived");
    }

    public static void main(String[] args) {
        Derived.display();

    }
}
