package com.design.adapter;

public class V220ToV5Adapter implements V5Power {
    public V220Power v220;
    public V220ToV5Adapter (V220Power v220) {
        this.v220 = v220;
    }

    @Override
    public int produceV5Power() {
        int power = v220.produceV220Power();
        //各种操作
        return 5;
    }
}
