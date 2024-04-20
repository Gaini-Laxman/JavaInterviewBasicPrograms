package com.javafullstackguru;

public class Singleton1 implements Cloneable{
    private static volatile Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if(instance == null){
            synchronized (Singleton1.class){
                if (instance == null){
                    instance = new Singleton1();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException("clone not allowed");
    }
}
