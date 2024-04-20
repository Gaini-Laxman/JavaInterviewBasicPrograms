package com.javafullstackguru;

public class Armstrong {
    public static void main(String[] args) {
        int num = 11;
        int result = 0;
        int originalNum = num;
        int numberOfDigits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            result += (int) Math.pow(digit, numberOfDigits);
            num /= 10;
        }
        if (originalNum == result) {
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
