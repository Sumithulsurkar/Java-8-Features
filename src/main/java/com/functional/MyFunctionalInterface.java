package com.functional;


@FunctionalInterface
public interface MyFunctionalInterface {

    //method with a no parameter
    public String greeting();

}

class BasicFIDemo {

    public static void main(String[] args) {

        MyFunctionalInterface mfi = () -> "Hello";
        System.out.println(mfi.greeting());
    }
}
