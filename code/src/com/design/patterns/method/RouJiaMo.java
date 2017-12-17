package com.design.patterns.method;

//简单工厂模式
public class RouJiaMo {
    private RouJiaMoFactory  factory = null;

    private void sell(String type){
        RouJiaMo mo = factory.createRouJiaMo(type);
    }
}
