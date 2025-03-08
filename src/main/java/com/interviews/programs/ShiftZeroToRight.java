package com.interviews.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class ShiftZeroToRight {

    public static void main(String[] args) {
        int[] a = new int[] { 5, 4, 0, 3, 2, 0, 1, 7, 0 };
        System.out.println(Arrays.toString(exchange(a)));

    }
    private static int[] exchange(int a[]) {
        int[] someArray = new int[a.length];
        int count = 0;
        for (int num : a) {
            if (num != 0) {
                someArray[count] = num;
                count++;
            } 
        }
        return someArray;
    }

}
