package com.design.decorator;

public class Shoe implements  IEqu{
    @Override
    public int attack() {
        return 5;
    }

    @Override
    public String desp() {
        return "鞋子";
    }
}
