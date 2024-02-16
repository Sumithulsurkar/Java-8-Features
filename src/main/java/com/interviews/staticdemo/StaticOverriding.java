package com.interviews.staticdemo;


/*
* Can we Override static methods in java?
* We can declare static methods with the same signature in the subclass,
* but it is not considered overriding as there won’t be any run-time polymorphism.
* Hence the answer is ‘No’. If a derived class defines a static method with the same signature
* as a static method in the base class, the method in the derived class is hidden by the method in the base class.
 */
public class StaticOverriding {

    // Static method in base class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from Base");
    }
}
