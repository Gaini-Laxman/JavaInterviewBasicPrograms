package com.javafullstackguru;

public class PalidromIntger {
    public static void main(String[] args) {
        int num = 122;
        int remainder;
        int reversedNum = 0;
        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println("Given Number is Palidrome");
        } else {
            System.out.println("Not Palidrom");
        }

    }
}
