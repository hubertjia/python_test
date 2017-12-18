package com.design.decorator;

public class Blue implements Decorators {
    private  IEqu equip;
    public  Blue(IEqu equip) {
        this.equip = equip;
    }
    @Override
    public int attack() {
        return equip.attack() + 2;
    }

    @Override
    public String desp() {
        return equip.desp() + "蓝宝石，";
    }
}
