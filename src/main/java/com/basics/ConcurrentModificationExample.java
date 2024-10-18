package com.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExample {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        Iterator itr = intList.iterator();
        while(itr.hasNext()) {
            int value = (int) itr.next();
            System.out.println(value);
            if(value == 1) {
                intList.remove(value);
                //itr.remove(); // Solution for ConcurrentModificationException
            }
        }
    }
}