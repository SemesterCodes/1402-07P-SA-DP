package com.hematmal.Ducks;

import com.hematmal.Fly.FlyBehavior;
import com.hematmal.Quack.QuackBehavior;

public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void PerformFly()
    {
        flyBehavior.Fly();
    }

    public void PerformQuack()
    {
        quackBehavior.Quack();
    }

    public void Display()
    {
        System.out.println("You can see me!");
    }
}
