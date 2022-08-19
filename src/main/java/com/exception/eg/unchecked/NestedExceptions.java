package com.exception.eg.unchecked;

import java.io.IOException;

public class NestedExceptions {

    public static void main(String[] args) {

        int a = 1, b = 0, c;

        try {
            //c = a/b;
            //System.out.println("Addition is : " +c);
            try {
                String s = null;
                String s1 = "Hi";
                System.out.println(s.equals(s1));
                try {
                    int[] array = {2, 4, 6, 8, 10};
                    System.out.println(array[10]);
                } catch (ArrayIndexOutOfBoundsException aiob) {
                    System.out.println("In Array Index Out Of Bounds Exception");
                }
            } catch (NullPointerException npe) {
                System.out.println("In In Null Pointer Exception");
            }
        } catch (ArithmeticException e) {
            System.out.println("In Arithmetic Exception");
        }
    }
}


