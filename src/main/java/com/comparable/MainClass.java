package com.comparable;

import java.util.Set;
import java.util.TreeSet;

public class MainClass {

    /* We can only sort the data wrt to only one property
       We have to implement Comparable interface with the same class  */

    public static void main(String[] args) {
        Set<Employee> empSet = new TreeSet<Employee>();
        empSet.add(new Employee("Sumit", 1245868));
        empSet.add(new Employee("Ramesh", 88457567));
        empSet.add(new Employee("Om", 25788926));
        empSet.add(new Employee("Mahesh", 12557818));
        empSet.add(new Employee("Himesh", 55227889));

        for(Employee emps : empSet) {
            System.out.println(emps.name + "  ---------------  " + emps.contact);

        }
    }
}
