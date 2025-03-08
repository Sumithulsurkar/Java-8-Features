package com.lambda.eg;

import java.util.ArrayList;
import java.util.List;

/**
 * Lambda expressions are used to process collection object's data
 * in easy way. They also helps to improve code readability
 */

public class LambdaExample {

    public static void main (String args[]) {

        ArrayList<Integer> intData = new ArrayList<Integer>();
        intData.add(10);
        intData.add(14);
        intData.add(16);
        intData.add(9);
        intData.add(20);
        intData.add(11);

        //showing the list of arraylist elements using lambda
        intData.forEach(lambdaArg -> System.out.println(lambdaArg));

        System.out.println("\n");

        //showing the list of arraylist elements using lambda with some condition
        intData.forEach(lambdaArg -> {
            if(lambdaArg%2 == 0) System.out.println(lambdaArg);
        });
    }
}
