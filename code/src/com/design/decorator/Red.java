package com.design.decorator;

public class Red implements Decorators {

    private  IEqu equip;
    public Red(IEqu equip) {
        this.equip = equip;
    }
    @Override
    public int attack() {
        return equip.attack() + 1;
    }

    @Override
    public String desp() {
        return equip.desp() + "红宝石";
    }
}
