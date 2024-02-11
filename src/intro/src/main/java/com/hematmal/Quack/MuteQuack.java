package com.hematmal.Quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void Quack() {
        System.out.println("I can't quack, I am mute!");
    }
    
}
