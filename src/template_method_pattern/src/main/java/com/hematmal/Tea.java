package com.hematmal;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
    
}
