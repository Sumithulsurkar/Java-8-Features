package com.stream.eg;

public class Employee {

    int id;
    int age;
    String name;
    String gender;
    String department;
    int yearOfJoinig;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoinig=" + yearOfJoinig +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, int age, String name, String gender, String department, int yearOfJoinig, double salary) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.yearOfJoinig = yearOfJoinig;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoinig() {
        return yearOfJoinig;
    }

    public void setYearOfJoinig(int yearOfJoinig) {
        this.yearOfJoinig = yearOfJoinig;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
