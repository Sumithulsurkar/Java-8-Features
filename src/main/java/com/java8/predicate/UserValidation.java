package com.java8.predicate;

import java.util.function.Predicate;

public class UserValidation {

    public static void main(String[] args) {

        Predicate<User> valid = check -> check.getUserId() == "admin" && check.getUserPwd() == "root";

        User user = new User("sumit", "don");
        User user1 = new User("admin", "root");
        if(valid.test(user1)){
            System.out.println("Login Successful...!");
        } else {
            System.out.println("Login Failed...!");
        }
    }
}
