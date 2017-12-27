package com.design;

public class EnumSingleton {
    private EnumSingleton() {}

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private  static enum Singleton{
        INSTANCE;
        private EnumSingleton singleton;
        private Singleton() {
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return singleton;
        }
    }
}


class EnumTest {
    private EnumTest() {}
    public static EnumTest getInstance() {
        return null;
    }

    private static enum Singleton{

        INSTANCE;
        private EnumTest sing ;
        private Singleton() {
            sing = new EnumTest();
        }

        public EnumTest getInstance(){
            return sing;
        }
    }
}