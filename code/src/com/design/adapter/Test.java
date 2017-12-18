package com.design.adapter;

public class Test {
    public static void main(String []args){
        Mobile mobile = new Mobile();
        V220Power v220 = new ChinaV220Power();
        V5Power v5= new V220ToV5Adapter(v220);
        mobile.charge(v5);
    }
}
