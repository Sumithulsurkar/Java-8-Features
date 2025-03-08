package com.basics;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStringByStreamAPI {


    public static void main(String[] args) {

        System.out.println("Get Number of vowels ================ Way 1");
        String str = "Hello World";
        long vowelCount = str.chars().filter(ch -> "aeiouAEIOUS".indexOf(ch) >= 0).count();
        System.out.println("Number of vowels: " + vowelCount + "\n");

        System.out.println("Get Number of vowels ================ Way 2");
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        long count = str.chars()
                .mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .count();
        System.out.println("Number of vowels: " + count + "\n");

        String trimmedInput = str.trim();
        Map<Character, Long> data = trimmedInput.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency Of each Character in the String  : " + data + "\n");

        List<Integer> intList = Arrays.asList(3, 4, 5, 67, 5, 4, 4, 6, 6, 6);
        Map<Integer, Long> collect = intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequency of numbers in an Array :  " + collect + "\n");

        List<Integer> distinctList = intList.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("Distinct Numbers in Natural Order in an Array :  " + distinctList + "\n");

        List<String> list = Arrays.asList("Amit", "Nagesh", "Sumit", "Birla", "Sam");
        List<String> naturalOrder = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List in the Natural Order " +naturalOrder + "\n");

        List<String> reverseOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted List in the Reverse Order " +reverseOrder + "\n");



    }

}
