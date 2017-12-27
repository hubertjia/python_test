package com.Multithreading;

public class InstanceLock implements Runnable {

    private ObjectAndInstanceLock lock;
    public InstanceLock(ObjectAndInstanceLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.InstanceLock();
    }
}
