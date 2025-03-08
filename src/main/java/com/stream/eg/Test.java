package com.stream.eg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    //[3,6,1,0,5,2,9,8]

    static int[] array = {3,6,1,0,5,2,9,8};

    public static void main(String[] args) {
    List<Integer> testList = new ArrayList<>();
        testList.add(3);
        testList.add(6);
        testList.add(1);
        testList.add(0);
        testList.add(5);
        testList.add(9);
        testList.add(8);

        //testList.stream().collect(Collectors.groupingBy(Integer::)

        for(int i = 0; i < array.length -1; i++){ //3,6,1,0,5,2,9,8
            if(11 == array[i] + array[i + 1]){
                System.out.println("Numbers forming the 11 are : " + array[i] + " AND " + array[i + 1]);
            }
        }
    }
}
