package com.javafullstackguru;

public class Car1 implements Vehicle1 {
    public void start() {
        System.out.println("Car Has been Started !");
    }

    public static void main(String[] args) {
        Car1 c = new Car1();
        Vehicle1.clean();
        c.start();
    }
}
