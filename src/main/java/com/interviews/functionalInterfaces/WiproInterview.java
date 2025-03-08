package com.interviews.functionalInterfaces;

public class WiproInterview {

        public static void main(String args[]) {
            MathOps mathOps = (x, y) -> x + y;
            int addition = mathOps.apply(100, 200);

            MathOps mathOps1 = (p, q) -> p * q;
            long multiplication = mathOps1.apply(10, 20);

            MathOps mathOps2 = (a, b) -> a - b;
            int subtraction = mathOps2.apply(200, 100);

            System.out.println("Addition is : " + addition);
            System.out.println("muliplication is : " + multiplication);
            System.out.println("subraction is : " + subtraction);
        }
    }
