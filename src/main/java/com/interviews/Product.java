package com.interviews;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Product {

    public static void main(String[] args) {

       // int product([1, 2, 3, 4]) == [24, 12, 8, 6];

        int array[] = {1, 2, 3, 4};
        int i1 = 0, i2  = 0, i3  = 0, i4 = 0;
        for (int n : array) {
            int i = n * n;
            System.out.println(i);
        }
    }
}
