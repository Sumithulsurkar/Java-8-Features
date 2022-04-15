package com.interviews;

public class ReverseString {

        public static void main(String args[]) {
            String s1 = "My name is Sumit";  //timuS si eman yM
            char charString [] = s1.toCharArray();
            String rev = "";
            for (int i = charString.length - 1 ; i >= 0; i--){
                rev += charString[i];
            }
            System.out.println(rev);
        }
}
