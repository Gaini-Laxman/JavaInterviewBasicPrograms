package com.javafullstackguru;

public interface Vehicle1 {
    public void start();
    public default void m1(){
        System.out.println("Default m1 Method");
    }
    public default void m2(){
        System.out.println("Default m2 Method");
    }
    public static void clean(){
        System.out.println("Clean Has  Been Completed!...");
    }
}

