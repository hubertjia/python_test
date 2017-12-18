package com.design.observer;

public class Test {
    public static void main(String[] args){
        DouBan ban = new DouBan();

        Samer samer = new Samer(ban);
        ban.notifyAllObserver("广播啦！！！");
    }
}
