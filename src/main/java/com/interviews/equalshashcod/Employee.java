package com.interviews.equalshashcod;

import com.main.User;

import java.util.Objects;

class Employee {

    Employee(int id){
    }

    int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}