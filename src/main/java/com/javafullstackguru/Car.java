package com.javafullstackguru;

public class Car implements Vehicle {
    public void start() {
        System.out.println("Car Has Started...");
    }

    public static void main(String[] args) {
        Car c = new Car();
        Vehicle.clean();
        c.start();
    }


}
