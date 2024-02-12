package com.hematmal;

import com.hematmal.Contracts.DisplayElement;
import com.hematmal.Contracts.Observer;
import com.hematmal.Contracts.Subject;

public class CurrentDisplay implements Observer, DisplayElement {

    Subject subject;

    public CurrentDisplay(Subject subject)
    {
        this.subject = subject;
        subject.Register(this);
    }

    public void RemoveMe()
    {
        subject.Remove(this);
    }

    Integer temp;
    @Override
    public void Display() {
        System.out.println("Data is changed");
        System.out.println(temp);
    }

    @Override
    public void Update(Integer temp) {
        this.temp = temp;
        Display();
    }
    
}
