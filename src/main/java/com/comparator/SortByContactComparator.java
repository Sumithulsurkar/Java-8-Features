package com.comparator;

import java.util.Comparator;

public class SortByContactComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.contact - emp2.contact;
    }
}
