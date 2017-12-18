package com.design.observer;

public class Samer implements Observer{

    private  Subject subject;
    public Samer(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void update(String meg) {

    }
}
