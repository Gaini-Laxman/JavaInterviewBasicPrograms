package com.javafullstackguru;

public class PalidromInteger1 {
    public static void main(String[] args) {
        int num = 121;
        int remainder;
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println("Palidrom😊");
        } else {
            System.out.println("Not Palidrom😥");
        }
    }
}
