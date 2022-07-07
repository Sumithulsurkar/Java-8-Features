package com.interviews;
import java.sql.*;
import java.text.*;
import java.util.*;
public class CodingPuzzels {
    public static void main(String[] args) {

        // Convert List to Array in Java
                List<String> list = Arrays.asList("Seeta", "Geeta", "Babeeta \n");

         // 1st approach
                String[] arr = new String[list.size()];  // Storing it inside array of strings
                for (int i = 0; i < list.size(); i++)    // Converting ArrayList to Array
                    arr[i] = list.get(i);                // using get() method
                for (String x : arr)                     // Printing elements of array on console
                    System.out.print(x + " ");

        // 2nd approach
                String[] arr1 = list.toArray(new String[0]);
                for (String x : arr1)                    // Printing elements of array on console
                            System.out.print(x + " ");
        // 3rd approach
                int n = list.size();
                String[] arr2 = list.stream().toArray(String[]::new); // Converting List to array via scope resolution operator using streams

                for (String x : arr2)                    // Printing elements of array on console
                    System.out.print(x + " ");
    }
}
