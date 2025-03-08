package com.threading;

public class ThreadEg extends Thread {
    ThreadEg(){
        System.out.println("Constructor invoked");
    }

    public void run(String s){
        System.out.println("Parameterised Run Invoked");
    }

    public void run(){
        System.out.println("Run Invoked");
    }
}

