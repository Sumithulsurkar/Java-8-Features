package com.threading;

public class Test {

    public static void main(String[] args) {

        ThreadEg threadEg = new ThreadEg() {
            public void run() {
                System.out.println("Invoked the RUN form Test class");
            }
        };
        threadEg.start();
    }
}
