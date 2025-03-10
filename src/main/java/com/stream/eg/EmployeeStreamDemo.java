package com.stream.eg;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {

    static ArrayList<Employee> employeeList = new ArrayList<Employee>();

    public static void display(Predicate<Employee> empPredicate, ArrayList<Employee> employeeList){
        for(Employee e: employeeList) {
            if(empPredicate.test(e)){
                System.out.println("+++++++++++++++++++++++++++++++++++" +e + "\n");
            }
        }
    }

    public static void main(String[] args) {

        employeeList.add(new Employee(111, 25, "Sumit", "M", "HR", 2021, 25000));
        employeeList.add(new Employee(222, 22, "Amit", "M", "IT", 2022, 30000));
        employeeList.add(new Employee(333, 24, "Suresh", "M", "Admin", 2011, 29000));
        employeeList.add(new Employee(444, 26, "Spruha", "F", "IT", 2006, 35000));
        employeeList.add(new Employee(555, 28, "Ashi", "F", "Devops", 2006, 55000));
        employeeList.add(new Employee(887, 29, "Sakshi", "F", "Account", 1994, 37000));
        employeeList.add(new Employee(666, 21, "Sahil", "M", "Sales", 1998, 60000));
        employeeList.add(new Employee(879, 23, "Nagesh", "F", "IT", 2020, 80000));
        employeeList.add(new Employee(882, 30, "Sumit", "M", "HR", 2021, 29000));
        employeeList.add(new Employee(996, 40, "Ankit", "M", "Marketing", 2014, 33000));

        System.out.println(employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList()));
        System.out.println("\n");

        System.out.println(employeeList.stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary)))
                .collect(Collectors.toList()));
        System.out.println("\n");

        System.out.println(employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary)));
        System.out.println("\n");

        System.out.println(employeeList
                .stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
        System.out.println("\n");

        System.out.println(employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList()))));

        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));


        Predicate<Employee> empPredicate = employee -> employee.getDepartment().equals("IT");
        Predicate<Employee> eP = epp -> epp.getSalary() > 60000;

        display(empPredicate, employeeList);

        display(eP, employeeList);

        System.out.println("Predicate's DEFAULT and Method DEMO ");
        display(empPredicate.and(eP), employeeList);

        System.out.println(" Predicate's DEFAULT or Method DEMO \n");
        display(empPredicate.or(eP), employeeList);

        // How many Male & female empls are there

        System.out.println("How many Male & Female Employees are there in the company: ");
        Map<String, Long> maleFemaleCount = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("========================================================= ");
        System.out.println("Print name of the EMP who works in the IT the Department in the company: ");
        employeeList.stream().filter(emp -> emp.getDepartment().contains("IT")).map(Employee::getName).forEach(System.out::println);

        System.out.println("========================================================= ");

        System.out.println("Print name of all the Department in the company: ");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println("========================================================= ");

        System.out.println("What is the average age of M & F employees:");
        Map<String, Double> maleFemaleAverage = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(maleFemaleAverage);

        System.out.println("========================================================= ");

        System.out.println("Details of highest paid employee:");
        Optional<Employee> maxSalaryEmployee = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(maxSalaryEmployee.get().getName() + " : " +  maxSalaryEmployee.get().getSalary());

        System.out.println("========================================================= ");

        System.out.println("Get name of the employee who joined the company after 2015 :");
        employeeList.stream()
                .filter(eoj -> eoj.getYearOfJoinig() > 2015).map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("========================================================= ");

        System.out.println("Count the number of EMPs department wise :");

        Map<String, Long> departmentCount =  employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        //departmentCount.entrySet().forEach(System.out::println);
        System.out.println(departmentCount);

        System.out.println("========================================================= ");

        System.out.println("Average salary department wise :");
        Map<String, Double> departAverage = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        //System.out.println(departAverage);

        departAverage.forEach((k, v) -> System.out.println("Average salary department wise IS ->>>>>>>>" + k + ":" + v));

        Set<Map.Entry<String, Double>> entrySet = departAverage.entrySet();
        for (Map.Entry<String, Double> entry : entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Youngest male EMP in the department :");
        Optional<Employee> youngEmp = employeeList.stream()
                .filter(mEmp -> mEmp.getGender() == "M" && mEmp.getDepartment() =="IT")
                        .min(Comparator.comparingInt(Employee::getAge));
        System.out.println(youngEmp.get().getId()  +  " : " + youngEmp.get().getName());

        System.out.println("========================================================= ");
        System.out.println("========================================================= ");

        System.out.println("========================================================= ");
    }
}
