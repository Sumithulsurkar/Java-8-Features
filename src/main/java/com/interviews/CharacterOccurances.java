package com.interviews;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterOccurances {
    public static void main(String[] args) {
        String s = "madam";

        Map<Character, Integer> map1 = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++) {
            if(!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), 1);
            } else {
                int temp = map1.get(s.charAt(i));
                map1.put(s.charAt(i), temp + 1);
            }
        }
        System.out.println(map1);

        //Java 8
        Map<Character, Long> map = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(map);

    }
}
