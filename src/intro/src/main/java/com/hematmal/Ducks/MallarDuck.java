package com.hematmal.Ducks;

import com.hematmal.Fly.FlyWithWings;
import com.hematmal.Quack.Squeak;

public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }
}
