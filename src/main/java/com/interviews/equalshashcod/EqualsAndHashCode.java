package com.interviews.equalshashcod;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCode {

  public static void main(String[] args) {
      Employee emp1 = new Employee(1);
      Employee emp2 = new Employee(1);

      Map<Employee, String> map = new HashMap<Employee, String>();
      System.out.println("Employee Objects Count: ");
      map.put(emp1, "jack");
      map.put(emp2, "jack");

   // Without overriding equals & hashcode methods we will get
   // Duplicate records
   System.out.println(map.size()); //2

   Integer i = new Integer(1);
   Integer i1 = new Integer(1);

    Map<Integer, String> map1 = new HashMap<Integer, String>();
    System.out.println("Integer Objects Count: ");
    map1.put(i, "one");
    map1.put(i1, "one");

    //ALl wrapper classes overrides equals() & hashcode(), That's why it returns 1
    System.out.println(map1.size()); //1
  }
}
