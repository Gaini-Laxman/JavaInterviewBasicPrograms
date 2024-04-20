package com.javafullstackguru;

public class ReverseNumber1 {
    public static void main(String[] args) {
        int num = 12345;
        while (num != 0) {
            System.out.print(num % 10);
            num /= 10;
        }
    }
}
