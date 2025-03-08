package com.interfaces;

public class MainInterfaceClass implements Interface1, Interface2{

    @Override
    public void getDefaultData() {
        Interface1.super.getDefaultData();
        Interface1.getStaticData();
    }
}
