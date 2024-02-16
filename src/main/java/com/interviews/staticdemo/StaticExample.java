package com.interviews.staticdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class StaticExample {

    //sequence of static matters, First Come First Executes

    static {
        int a = 40;
        System.out.println(a);
    }

    static {
        int a = 10;
        System.out.println(a);
    }

    static {
        int a = 30;
        System.out.println(a);
    }

    public static void main(String[] args) {

    }
}
