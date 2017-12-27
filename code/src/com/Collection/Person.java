package com.Collection;

public class Person {
    private String name;
    private String sex;
    private int total;

    public Person(String name, String sex, int total) {
        this.name = name;
        this.sex = sex;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
