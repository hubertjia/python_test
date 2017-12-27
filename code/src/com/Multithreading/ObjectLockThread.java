package com.Multithreading;

public class ObjectLockThread implements Runnable {
    private ObjectAndInstanceLock lock;
    public ObjectLockThread(ObjectAndInstanceLock lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        lock.objectLock();
    }
}
