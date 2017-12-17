package com.design.patterns.abstarct;

public class XiAnRouJiaMo implements AbstractInterfaceFactory {
    @Override
    public YuanLiao createYL() {
        return new YuanLiao();
    }

    @Override
    public Meat createMeat() {
        return new Meat();
    }
}
