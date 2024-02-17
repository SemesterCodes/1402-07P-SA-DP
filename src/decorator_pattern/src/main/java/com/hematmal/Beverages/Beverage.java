package com.hematmal.Beverages;

public abstract class Beverage {
    String description;

    public String GetDescription() {
        return description;
    }

    public abstract double Cost();
}
