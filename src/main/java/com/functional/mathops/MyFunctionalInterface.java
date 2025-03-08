package com.functional.mathops;

class FuncInterfaceExample {

    public static void main(String[] args) {

        System.out.println("Functional Interface for Multiplication");
        FInterface result = (a, b) -> (a * b);
        System.out.println("Multiplication Result is: " +result.operation(4,7));

        FInterface sub = (p, q) -> (p - q);
        System.out.println("Subtraction is : " + sub.operation(10, 5));

        FInterface add = (x, y) -> (x + y);
        System.out.println("Addition is : " + add.operation(10, 2));

    }
}
