package com.interviews.staticdemo;

/*
* Static methods can be overloaded as normal non static methods
* */

public class StaticOverloading {

    public static void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    public static void add(int a, int b, int k){
        int d = a + b + k;
        System.out.println(d);
    }

    public static void main(String[] args) {
        StaticOverloading.add(2, 3);
        StaticOverloading.add(3, 4, 5);
    }
}
