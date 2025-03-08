package com.exception.eg.custom;

public class  MainCustom {

    static void validate(int age) throws CustomExp {
        if(age < 18 ){
            //throw and object if user defined exception
            throw new CustomExp("Age " + age + " is Not a valid for voting");
        } else {
            System.out.println( " " + age + " Age is a valid for voting");
        }
    }

    public static void main(String[] args) {
        try {
            validate(10);
        } catch (CustomExp e) {
            e.printStackTrace();
            System.out.println("Exception occurred : " + e);
        } finally {
            System.out.println("In Final Block");
        }
    }
}
