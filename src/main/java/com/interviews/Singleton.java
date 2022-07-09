package com.interviews;

/**
 * Double Check Locking based Java implementation of
 * singleton design pattern
 */

public class Singleton {

    private static volatile Singleton obj = null;

    private Singleton() { }

    public static Singleton getInstance() {
        if (obj == null) {

            //To make sure only one thread can access data a time.
            synchronized (Singleton.class) {
                if (obj == null){
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }
}
