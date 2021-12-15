package com.interfaces;

public interface Interface1 {

    public default void getDefaultData(){
        System.out.println("We are in Default Method of Interface 1");
    }

    public static void getStaticData(){
        System.out.println("We are in Static Method of Interface 1");
    }
}
