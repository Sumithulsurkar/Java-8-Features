package com.threading;

import java.util.Arrays;

public class MaxProfitDays {


    private static void findMaxProfitDays(int[] prices) {
        int buyingPrice, sellingPrice, difference, buyCount = 0, sellCount = 0;
        /*Arrays.stream(prices).forEach( p -> {
            if(p )
        });*/

        for (int i = 0; i < prices.length -1; i++) {
            difference = prices[i] - (prices[i + 1]);
            if (difference > i) {
                buyCount++;
                System.out.println("Purchase at day " + buyCount + " and sell at day " + buyCount + 1 + " and your profit is : " + difference);
            }/* else {
                sellCount++;
                System.out.println("Purchase at day " + count + " and sell at day " + count + " and your profit is : " + difference);
            }*/
        }
    }
    public static void main(String[] args) {

        int price[] = {20,10,20,30,40,50,80,10,90 };

        findMaxProfitDays(price);


    }
}
