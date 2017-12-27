package com.Multithreading;

public class Test {

    public static void main(String[] args) {
        ObjectAndInstanceLock lock1 = new ObjectAndInstanceLock();
        ObjectLockThread obj = new ObjectLockThread(lock1);
        Thread t1 = new Thread(obj);
        InstanceLock ins = new InstanceLock(lock1);
        Thread t2 = new Thread(ins);
        t1.start();
        t2.start();
    }
}
