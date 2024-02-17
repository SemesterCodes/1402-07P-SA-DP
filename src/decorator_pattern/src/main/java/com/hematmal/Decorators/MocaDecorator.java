package com.hematmal.Decorators;

import com.hematmal.Beverages.Beverage;

public class MocaDecorator extends CondimentDecorator {

    public MocaDecorator(Beverage beverages)
    {
        beverage = beverages;
    }

    @Override
    public String GetDescription() {
        return null;
    }

    @Override
    public double Cost() {
        return beverage.Cost() + .20;
    }
    
}
