package com.javafullstackguru;

public interface i1 {
    default void display() {
        String i1 = "print interface i1";
        System.out.println(i1);
    }

    interface i2 {
        default void display() {
            String i2 = "print interface i2"; // Corrected interface name
            System.out.println(i2);
        }
    }

    class A implements i1, i2 {
        public static void main(String[] args) {
            A obj = new A();
            obj.display();
        }

        @Override
        public void display() {
            i1.super.display();
            i2.super.display();
            //i1.this.display();
        }
    }
}
