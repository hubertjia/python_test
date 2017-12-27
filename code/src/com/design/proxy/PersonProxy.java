package com.design.proxy;

public class PersonProxy implements PersonModelApi {


    private Person person;

    public  PersonProxy(Person person) {
        this.person = person;
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
        if("张三".equals(person.getName())) {
            System.out.println("您是高级用户，您可以开通！");
        } else {
            System.out.println("没有权限！");
        }
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void setAge(int age) {

    }

    @Override
    public String getSex() {
        return null;
    }

    @Override
    public void setSex(String sex) {

    }
}
