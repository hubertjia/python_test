package com.clas;

public class Test {
    public static void main(String[] args) {
        System.out.println( WeekEnum.FRIDAY.getDate());
        for (WeekEnum we: WeekEnum.values()) {
            System.out.println(we);
        }
        System.out.println(WeekEnum.values());
    }
}
