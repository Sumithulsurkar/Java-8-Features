package com.interviews;

import java.util.HashMap;
import java.util.Map;

import static com.interviews.LengthOfString.getLongestString;

public class LengthOfString {

    static void getLongestString(String s) {

        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), 1);
            } else {
                map1.remove(map1.get(s.charAt(i)));
                System.out.println("*******************");
                System.out.println(map1);
            }
        }
    }

    public static void main(String[] args) {

        String str = "abcpqrrrrraas"; //abcrpqs
        getLongestString (str); //pqrxyz
    }
}
