package com.design.observer;

public interface Subject {

    public void add(Observer obs);
    public void remove(Observer obs);
    public void notifyAllObserver(String mes);
}
