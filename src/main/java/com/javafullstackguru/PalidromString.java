package com.javafullstackguru;

public class PalidromString {
    public static void main(String[] args) {
        String s = "laxman";
        int left = 0;
        int right = s.length() - 1;
        boolean isPalidrom = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalidrom = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalidrom) {
            System.out.println("Palidrom 😀");
        } else {
            System.out.println("Not Palidrom 😪");
        }
    }
}
