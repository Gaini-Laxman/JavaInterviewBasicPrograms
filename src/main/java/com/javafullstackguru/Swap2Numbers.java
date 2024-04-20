package com.javafullstackguru;

public class Swap2Numbers {
    public static void main(String[] args) {
        int a = 1, b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + "," + b);
        System.out.println("=============");
        int x = 3, y = 4, z = 5, temp = z;
        x = y;
        y = temp;
        temp = x;
        System.out.println(x + "," + y + "," + z);
    }
}
