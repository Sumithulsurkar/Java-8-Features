package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharCount {

    public static void main(String args[]) {

        String str = "madam";

        String str1 = "java";
        Character[] chars = str1.chars().mapToObj(ch -> (char) ch).toArray(Character[]::new);
        System.out.println(Arrays.toString(chars));

        Map<String, Long> result =
                 Arrays.stream(str.split(""))
                .map(String::toLowerCase) //groupingBy (Function, Supplier, Collector) -> (input value, condition, increment)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(result);
    }
}




