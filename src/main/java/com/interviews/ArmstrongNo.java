package com.interviews;

import java.util.Scanner;

public class ArmstrongNo {

        // there is no two-digit Armstrong number.
        //An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits. It is also known as pluperfect, or Plus Perfect, or Narcissistic number.

        public static void main(String args[])
        {
            int number = 3701, originalNumber, remainder, result = 0;

            originalNumber = number;

            while (originalNumber != 0)
            {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
            }

            if(result == number)
                System.out.println(number + " is an Armstrong number.");
            else
                System.out.println(number + " is not an Armstrong number.");
        }
    }