package com.inheritance;

public class MainInheritance {

    public static void main(String[] args) {


        Parent parent1 = new Child();
        parent1.show();

        Child c = (Child) new Parent();// It will throw exception
        c.show();

        System.out.println("As Child is extending the Parent class, that's why Parent constructor is invoked first then followed by Child constructor & method ");
        Child ch = new Child();
        ch.show(); // child's method will be invoked

        System.out.println("--------------------------");

        Parent p = new Parent();
        p.show(); // Parent's method will be invoked


        System.out.println("--------------------------");

        Parent parent = new Child();
        parent.show(); // Child's method will be invoked

        //Parent Constructor Called
        //Child Constructor Called
        //Child Method Called
    }
}
