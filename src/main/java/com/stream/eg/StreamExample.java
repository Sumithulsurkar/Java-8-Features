package com.stream.eg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream is used to process the collection objects
 * filter(predicate) -> return type of predicate is always boolean -> to perform the conditional check
 * map(function) -> It needs function as argument, do some operation as per business logic.
 *
 */

public class StreamExample {

    public static void main (String args[]){

        ArrayList<Integer> data = new ArrayList<Integer>();

        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(55);
        data.add(67);

        System.out.println("Marks of the students: " + data);

        //Applying the logic of even marks for the students.
        List<Integer> evenList = data.stream().filter(marks -> marks % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Marks of the students: " + evenList);

        //giving the 5 grace marks for the students.
        List<Integer> graceList = data.stream().map(i -> i + 5).collect(Collectors.toList());
        System.out.println("Marks of the students After adding 5 grace marks: " + graceList);
        
        //count of failed students
        long count = data.stream().filter(failCheck -> failCheck < 40).count();
        System.out.println("List of failed students: " + count);

        //Natural Sorted list
        List<Integer> naturalSortedList = data.stream().sorted().collect(Collectors.toList());
        System.out.println("Natural sorted List of students: " + naturalSortedList);

        //Sorted list using Comparator
        List<Integer> sortedListByComparator  = data
                .stream()
                .sorted((obj1, obj2) -> (obj1 < obj2) ? 1 : (obj1 > obj2) ? -1 : 0)
                .collect(Collectors.toList());
        System.out.println("Sorted List of students using comparator: " + sortedListByComparator);

        //Sorted list using comparor
        List<Integer> sortedListByComparer = data
                .stream()
                .sorted((var1, var2) -> -var1.compareTo(var2))
                .collect(Collectors.toList());
        System.out.println("Sorted List of students using Comparer: " + sortedListByComparer);

        ArrayList<String> stringData = new ArrayList<String>();
        stringData.add("A");
        stringData.add("AAA");
        stringData.add("AA");
        stringData.add("AAAA");

        //If we want to sort the data wrt length of names
        Comparator<String> c = (s1, s2) -> {
               int l1 = s1.length();
               int l2 = s2.length();
               if(l1 < l2) return -1;
               else if (l1 > l2) return 1;
               else return (s1.compareTo(s2));
        };

        List<String> sortingWRTLength = stringData
                .stream()
                .sorted(c)
                .collect(Collectors.toList());
        System.out.println("List of Students wrt length of name: " +sortingWRTLength);

        //forEach iteration using stream API
        System.out.println("For Each Demonstration with revered sorting:");
        data.stream().sorted((val1, val2) -> -val1.compareTo(val2)).forEach(System.out::println);

        //function as argument
        data.stream().forEach(i -> {
            System.out.println("The Square of the" + " " +i + " is: " + i * i);
        });

        // to convert stream objects into array & again converting array into stream objects
        Integer[] arrayElements = data.stream().toArray(Integer[]::new);
        System.out.println("These are the array elements which was converted from Stream : ");

        for(Integer i :arrayElements ){
            System.out.println(i);
        }

        //converting array into stream object
        System.out.println("Now converting Array into Stream :");
        Stream.of(arrayElements).forEach(System.out::println);
    }
}
