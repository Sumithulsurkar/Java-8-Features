package com.java8.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * Program to remove null & blank values from string list
 */
public class ArrayListCheck {

    public static void main(String[] args) {
        String [] names = {"Punguu", "", null, "Samruddhi"};
        ArrayList<String> newList = new ArrayList<>();
        Predicate<String> str =  check -> check != null && check.length() != 0;
        for(String s : names){
            if(str.test(s)){
                newList.add(s);
            }
        }
        System.out.println(newList);
    }
}
