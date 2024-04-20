package com.javafullstackguru;

public class Singleton2 implements Cloneable{
    private static volatile Singleton2 instance;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        if(instance == null){
            synchronized (Singleton2.class){
                if (instance == null){
                    instance = new Singleton2();
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
