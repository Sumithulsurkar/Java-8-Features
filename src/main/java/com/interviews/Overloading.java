package com.interviews;

public class Overloading {
    public void show(String s){
        System.out.println("String Method Called");
    }
    public void show(Object o){
        System.out.println("Object Method Called");
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.show(null); //It gives higher preference to String argument
    }
}
