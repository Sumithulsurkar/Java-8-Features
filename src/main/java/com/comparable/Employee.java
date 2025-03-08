package com.comparable;

public class Employee implements Comparable<Employee> {

    String name;
    int contact;

    Employee(String name, int contact) {
        this.name = name;
        this.contact = contact;
    }
    @Override
    public int compareTo(Employee empObject) {
        return this.name.compareTo(empObject.name);
        //return this.contact - empObject.contact; to compare int type of values
    }
}
