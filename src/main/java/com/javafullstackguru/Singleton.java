package com.javafullstackguru;

public class Singleton implements Cloneable {
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation from outside
    Singleton() {}

    // Static method to get the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Override clone method to throw exception
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning of Singleton class is not allowed");
    }

    // Other methods and fields can be added as needed
}
