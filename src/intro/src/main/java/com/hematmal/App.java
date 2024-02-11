package com.hematmal;

import com.hematmal.Ducks.MallarDuck;
import com.hematmal.Ducks.NewDuck;

public class App {
    public static void main(String[] args) {
        System.out.println("Mallar Duck");
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.PerformQuack();
        mallarDuck.PerformFly();

        System.out.println("New Duck");
        NewDuck newDuck = new NewDuck();
        newDuck.PerformFly();
        newDuck.PerformQuack();
    }
}
