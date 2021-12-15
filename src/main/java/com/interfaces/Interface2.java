package com.interfaces;

public interface Interface2 {

    public default void getDefaultData(){
        System.out.println("We are in Default Method of Interface 2");
    }

    public static void getStaticData(){
        System.out.println("We are in Static Method of Interface 2");
    }
}
