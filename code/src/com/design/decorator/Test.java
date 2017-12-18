package com.design.decorator;

public class Test {

    public static void main(String[] args) {
        IEqu equ = new Red(new Blue(new Shoe()));

        System.out.println("攻击力：" + equ.attack() + ",用品是：" + equ.desp());

    }
}
