package com.stream.eg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringStream {

    public static void main(String[] args) {

        ArrayList<String> stringData = new ArrayList<>();

        stringData.add("Sumit");
        stringData.add("Suresh");
        stringData.add("Ramesh");
        stringData.add("Amit");

        System.out.println(stringData.stream().count());

        /*
        stringData.stream().filter(countVar -> countVar % 3 == 0)*/

        ArrayList<String> strList = new ArrayList<>();

        ArrayList<Integer> intData = new ArrayList<>();

        int count1 = 0, temp = 0;
        for(int i = 0; i <= stringData.size() -1 ; i++){
            intData.add(count1);
            intData.add(temp + 1);

            String s = stringData.get(i) + (count1 + 1) + (count1 + 2) + (count1 + 3);
            strList.add(s);
            count1 += 3;
        }
        System.out.println(strList);
        //Sourabh Saxena
        /*input - Sumit, Sourabh, Priya...
        output - Sumit123, Sourabh456, Priya789...*/

        //for(int i = 0; i <  )

        //System.out.println(stringData.stream().filter(s -> s.contains("s")).collect(Collectors.toList()));

        AtomicInteger count = new AtomicInteger();

        //int count1 = 123;
        /*stringData.stream()
                .map(str -> str + count1).forEach(s -> count1)
                .peek(value -> System.out.println("Values are: " + value))
                .collect(Collectors.toList());
    }*/
    }
}
