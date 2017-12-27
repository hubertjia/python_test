package com.design.proxy;

public class Test {
    public static void main(String[] args) {
//        Person person = new Person("张三",16,"男");
//        PersonProxy proxy = new PersonProxy(person);
//        proxy.setName("");
//
//        person.setName("lisi");
//        proxy.setName("");

        Person person = new Person("lisi",20,"nan");
        DynamicProxy proxy = new DynamicProxy();
        PersonModelApi personModelApi = proxy.getPersonModel(person);
        personModelApi.setSex("nv");

        System.out.println(person.getSex());
    }
}
