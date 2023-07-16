package com.comparator;

import java.util.Comparator;

public class SortByCityComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.city.compareTo(emp2.city);
    }
}
