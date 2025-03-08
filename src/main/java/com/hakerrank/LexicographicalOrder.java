package com.hakerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LexicographicalOrder {

    public static String getSmallestAndLargest (String s,int k){
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for(int i=0; i<s.length()-k+1; i++) {
            String input = s.substring(i, k + i);
            if (input.compareTo(largest) > 0) {
                largest = input;
            }
            if (input.compareTo(smallest) < 0) {
                smallest = input;
            }
        }
        System.out.println(largest + " , "+ smallest);
    return "";
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        Map<Character, Long> collect = a1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> collect1 = b1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        boolean b2 = collect1.entrySet().stream().allMatch(e -> e.getValue().equals(collect.get(e.getKey())));
        if(b2)
            System.out.println("Anagrams");
        /**
         * 2nd sol
         *
         */
        char[] c = a.toLowerCase().toCharArray();
        char[] h = b.toLowerCase().toCharArray();
        Arrays.sort(c);
        Arrays.sort(h);

        if( Arrays.equals(c,h)){
            return true;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";
        String reversed = str.chars().mapToObj(c -> (char)c).reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
        if(str.equals(reversed)) {
            System.out.println("Yes its an palindrome");
        } else {
            System.out.println("No a palindrome");
        }

        isAnagram("anagram", "marganabg");

        getSmallestAndLargest("welcometojava", 3);
    }
}
