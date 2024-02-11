package com.hematmal.Ducks;

import com.hematmal.Fly.FlyNoWay;
import com.hematmal.Quack.Quack;

public class NewDuck extends Duck {
    public NewDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
