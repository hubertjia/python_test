package com.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {


    private PersonModelApi personApi;
    public PersonModelApi getPersonModel(Person person) {
        this.personApi = person;
        PersonModelApi personApi2 = (PersonModelApi) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),this);
        return personApi2;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("setSex")) {

            if(personApi.getAge() > 18) {
                System.out.println("大于18岁，可以自主修改性别！");
            }
            return method.invoke(personApi,args);
        }

        return null;
    }
}
