package com.javafullstackguru;

public class PalidromeString1 {
    public static void main(String[] args) {
        String s = "radar System";
        int left = 0;
        int right = s.length() - 1;
        boolean isPalidrome = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalidrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalidrome) {
            System.out.println("Palidrome 😀 ");
        } else {
            System.out.println("Not Palidrom 😪 ");
        }
    }
}
