package com.exception.eg.unchecked;

public class DefaultExceptionHandling {
    public static void main(String[] args) {
        m1(); // main() method calling m1().
    }
    public static void m1() {
        m2(); // m1() method calling m2().
        int i = Integer.parseInt("abc");   // Exceptional case. A Number Format Exception
    }

    public static void m2() {
        System.out.println("Hello");
    }
}
