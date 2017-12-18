package com.Multithreading;

public class Thread1 extends Thread {

    private  Person person1;
    private  Person person2;
    public Thread1(Person person1,Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    @Override
    public void run(){
        person1.getEatLock(person1,person2);
    }
}
