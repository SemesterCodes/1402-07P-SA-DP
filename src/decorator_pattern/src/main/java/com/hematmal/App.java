package com.hematmal;

import com.hematmal.Beverages.Beverage;
import com.hematmal.Beverages.Espresso;
import com.hematmal.Decorators.MocaDecorator;

public class App 
{
    public static void main( String[] args )
    {
        Beverage espresso = new Espresso();
        System.out.println("Espresso");
        System.out.println(espresso.Cost());
        MocaDecorator moca = new MocaDecorator(espresso);
        System.out.println("Espresso with Moca");
        System.out.println(moca.Cost());
        MocaDecorator moca2 = new MocaDecorator(moca);
        System.out.println("Espresso with double moca");
        System.out.println(moca2.Cost());

    }
}
