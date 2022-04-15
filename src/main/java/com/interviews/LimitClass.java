package com.interviews;

/**
 * We can restrict the creation of Object for a particular class by
 * little modification in Singleton design pattern as below:
 */

public class LimitClass {

    private static LimitClass limitInstance;
    public static int objCount = 0;

    private LimitClass() {
        objCount++;
    }

    public static synchronized LimitClass getLimInstance(){
        if (objCount < 3){
            limitInstance = new LimitClass();
        }
        return limitInstance;
    }

    public static void main(String[] args) {

        LimitClass obj1 = LimitClass.getLimInstance();
        LimitClass obj2 = LimitClass.getLimInstance();
        LimitClass obj3 = LimitClass.getLimInstance();
        LimitClass obj4 = LimitClass.getLimInstance();
        LimitClass obj5 = LimitClass.getLimInstance();
        LimitClass obj6 = LimitClass.getLimInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);
    }
}
