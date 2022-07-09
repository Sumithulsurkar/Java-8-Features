package com.interviews;

public class StatementReverse {

    public static void main(String[] args) {

        String s = "I love coding";
        String words[] = s.split("\\s");
        String reversedString = "";

        for(int i = 0; i < words.length; i++) {
            if( i == words.length - 1) {
                reversedString = words[i] + reversedString;
            } else {
                reversedString = " " + words[i] +reversedString;
            }
        }
            System.out.print(" Reversed string : " + reversedString);
    }

}
