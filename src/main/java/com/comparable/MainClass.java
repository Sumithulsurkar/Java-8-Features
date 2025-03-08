package com.comparable;

import java.util.*;

 /* We can only sort the data wrt to only one property
    We have to implement Comparable interface with the same class
    Natural order, sorted automatically by using Collections.sort() or Arrays.sort()
    */

public class    MainClass {

    public static void main(String[] args) {
       Set<Employee> empSet = new TreeSet<Employee>();
        //List<Employee> empSet = new ArrayList<Employee>();

        empSet.add(new Employee("Sumit", 11));
        empSet.add(new Employee("Sumit", 3));
        empSet.add(new Employee("Himesh", 55227889));

        empSet.add(new Employee("Om", 25788926));
        empSet.add(new Employee("Mahesh", 12557818));
        empSet.add(new Employee("Himesh", 55227889));

        for(Employee emps : empSet) {
            System.out.println(emps.name + "  ---------------  " + emps.contact);
        }
    }
}
