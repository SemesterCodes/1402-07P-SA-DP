package com.hematmal;

import java.util.ArrayList;

import com.hematmal.Contracts.Observer;
import com.hematmal.Contracts.Subject;

public class WeatherData implements Subject{

    Integer temperature;
    ArrayList<Observer> observers;
    
    WeatherData()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void Register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void Remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void Notify() {
        for(Observer observer : observers)
        {
            observer.Update(temperature);
        }
    }
    
    public void SetTemperature(Integer temp)
    {
        this.temperature = temp;
        Notify();
    }
}
