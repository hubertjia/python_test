package com.Multithreading;

public class NoVisibility {

    private static volatile boolean ready;
    private static int num;

    private static class innerThread extends  Thread {

        @Override
        public void run() {

            while (!ready) {
                Thread.yield();
            }

            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        new innerThread().start();
        num = 42;
        ready = true;
    }
}
