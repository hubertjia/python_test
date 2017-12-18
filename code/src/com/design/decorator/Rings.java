package com.design.decorator;

public class Rings implements IEqu {
    @Override
    public int attack() {
        return 15;
    }

    @Override
    public String desp() {
        return "戒指";
    }
}
