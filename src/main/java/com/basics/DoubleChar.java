package com.basics;

public class DoubleChar {

    static String str = "sam";
    public static String getDoubleChar(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String doubleStr = getDoubleChar(str);
        System.out.println(" RES : " +doubleStr);
    }
}
