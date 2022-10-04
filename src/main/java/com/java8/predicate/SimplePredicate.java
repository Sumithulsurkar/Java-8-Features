package com.java8.predicate;

import java.util.function.Predicate;

public class SimplePredicate {

    /**
     * Predicate has only one abstract boolean method called test()
     * It has 3 defaults method
     * -> and
     * -> or
     * -> negate
     * and 1 static method isEqual()
     *
     * @param args
     */

    public static void main(String[] args) {
        String s = "Samruddhi_Sumit_Hulsurkar";

        Predicate<String> predicate = s1 -> s1.length() > 30;
        System.out.println(predicate.test(s));

        Predicate<Integer> predicate1 = age -> age > 18;
        System.out.println(predicate1.test(25));

        Predicate<String> predicate2 = Predicate.isEqual("Samruddhi_Sumit_Hulsurkar");

        System.out.println(predicate2.test(s));

        // It accepts ONLY ONE value
    }
}
