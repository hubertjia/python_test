package com.Multithreading;

public class ObjectAndInstanceLock {

    public  void objectLock(){

        synchronized (ObjectAndInstanceLock.class) {
            try{
                System.out.println("获取到类锁！");
                Thread.sleep(30000000);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public  void InstanceLock() {
        synchronized (this) {
            try{
                System.out.println("获取到对象锁");
                Thread.sleep(30000000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
