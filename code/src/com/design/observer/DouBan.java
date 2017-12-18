package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class DouBan implements Subject {

    List<Observer> list = new ArrayList<Observer>();
    @Override
    public void add(Observer obs) {
        int index = list.indexOf(obs);
        if( index == -1) {
            list.add(obs);
        }
    }

    @Override
    public void remove(Observer obs) {
        int index = list.indexOf(obs);
        if (index > -1) {
            list.remove(obs);
        }
    }

    @Override
    public void notifyAllObserver(String mes) {
        for(Observer obs: list) {
            obs.update(mes);
        }
    }

    public  void broadcast(String mes) {
        notifyAllObserver(mes);
    }
}
