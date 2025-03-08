package com.statickeyword;

public class StaticGame {

    static int a = 10;

    static {
        a = 20;
    }

    public static void main(String[] args) {
        int a = 30;
        System.out.println(a);
    }
}
