package com.java8.supplier;

import java.util.function.Supplier;

/**
 * Random number generation
 */
public class SupplierExample {

    /**
     * Supplier has one abstract method -> get
     *
     * @param args
     */

    public static void main(String[] args) {

        Supplier<String> no = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(no.get());
        System.out.println(no.get());

        //2468 - indexes - digit; 1357- char || symbol

        Supplier<String> pwd = () -> {
            String pswd = "";

            Supplier<Integer> digitSup = () -> (int) (Math.random() * 10);
            String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@$&";
            Supplier<Character> charSupp = () -> s.charAt((int) (Math.random() * 29));
            for (int i = 1; i <= 8; i++) {
                if (i % 2 == 0) {
                    pswd += digitSup.get();
                } else {
                    pswd += charSupp.get();
                }
            }
            return pswd;
        };
        System.out.println(pwd.get());
    }
}