package com.hematmal.Decorators;

import com.hematmal.Beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String GetDescription();
}
