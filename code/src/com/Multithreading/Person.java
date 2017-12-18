package com.Multithreading;

public class Person extends Thread {

    public void getEatLock(Person person1,Person person2) {
        synchronized (person1){
            try {
                System.out.println("获取到吃的锁，开始吃------");
                Thread.sleep(300);
            } catch(Exception e) {
                e.printStackTrace();
            }

            synchronized (person2) {
                try {
                    System.out.println("获取到睡觉的锁，开始睡------");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println("吃睡结束！");
        }
    }


    public  void getSleepLock (Person person1,Person person2) {

        synchronized (person2) {
            try{
                System.out.println("获取到睡觉的锁，睡觉中-------");
            }catch (Exception e) {
                e.printStackTrace();
            }

            synchronized (person1) {
                try {
                    System.out.println("获取到吃饭的锁，吃饭中------");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println("睡完吃饭结束");
        }
    }

}
