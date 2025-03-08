package com.threading;

public class Multithreading {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Threading myThread = new Threading(i);
            myThread.start();
        }
    }
}
