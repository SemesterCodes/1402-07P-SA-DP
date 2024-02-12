package com.hematmal;

import com.hematmal.Contracts.DisplayElement;
import com.hematmal.Contracts.Observer;
import com.hematmal.Contracts.Subject;

public class iPadDisplay implements Observer, DisplayElement {

    Integer temp;

    public iPadDisplay(Subject subject)
    {
        subject.Register(this);
    }
    @Override
    public void Display() {
        System.out.println("I am iPad");
        System.out.println(temp);
    }

    @Override
    public void Update(Integer temp) {
        this.temp = temp;
        Display();
    }
    
}
