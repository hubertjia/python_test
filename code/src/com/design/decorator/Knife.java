package com.design.decorator;

public class Knife implements IEqu {

    @Override
    public int attack() {
        return 20;
    }

    @Override
    public String desp() {
        return "屠龙刀";
    }
}
