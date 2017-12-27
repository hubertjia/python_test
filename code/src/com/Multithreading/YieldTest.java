package com.Multithreading;

public class  YieldTest extends Thread {

    public YieldTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 1; i <= 20; i++) {

            System.out.println("" + this.getName() + "-----" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
            if (i == 10) {
                System.out.println("" + this.getName() + "----- yield");
                this.yield();
            }
            count++;
        }
    }

    public static void main(String[] args) {
        YieldTest yt1 = new YieldTest("张三");
        YieldTest yt2 = new YieldTest("李四");
        yt1.start();
        yt2.start();
    }
}
