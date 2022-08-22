package com.exception.eg.unchecked;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClassCastExcep {

    // Integer object can't cast to String type of Object

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Sumit");
        list.add(new Integer(5));

        for(Object obj : list){
            String s = String.valueOf(list);
            String str = (String)obj;
            System.out.println(s);
        }
    }
}
