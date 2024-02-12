package com.hematmal.Contracts;

public interface Subject {
    public void Register(Observer observer);
    public void Remove(Observer observer);
    public void Notify();
}
