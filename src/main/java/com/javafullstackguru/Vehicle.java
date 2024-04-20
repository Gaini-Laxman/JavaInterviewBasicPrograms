package com.javafullstackguru;

public interface Vehicle {
    public void start();
    public default void m1(){

    }
    public default void m2(){

    }
    public static void clean(){
        System.out.println("Clean Completed");
    }
}
