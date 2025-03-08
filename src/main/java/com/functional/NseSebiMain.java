package com.functional;

public class NseSebiMain implements Sebi {
    @Override
    public void isFundPresent() {
        System.out.println("Fund is Available for buying stocks");
    }

    public static void main(String[] args) {

        NseSebiMain mainObj = new NseSebiMain();
        mainObj.isFundPresent();
        mainObj.buyStokcs();
    }
}
