package com.comparator;

import com.comparator.Employee;

import java.util.Set;
import java.util.TreeSet;

public class MainClass {

    /* Using comparable we can use only one comparison.
       Whereas, we can write more than one custom comparators as you want */

    public static void main(String[] args) {

        Set<com.comparator.Employee> empSet = new TreeSet<>( new SortByCityComparator());

        //Set<com.comparator.Employee> empSet = new TreeSet<>( new SortByContactComparator());

        empSet.add(new com.comparator.Employee("Sumit", "Delhi",1245868));
        empSet.add(new com.comparator.Employee("Ramesh", "Pune", 88457567));
        empSet.add(new com.comparator.Employee("Onkar", "Manali",25788926));
        empSet.add(new com.comparator.Employee("Mahesh", "Shimla",12557818));
        empSet.add(new com.comparator.Employee("Himesh", "McLeodGanj",55227889));

        for(Employee emps : empSet) {
            System.out.println(emps.city + "---------------" + emps.contact + "---------------" + emps.name);
        }
    }
}
