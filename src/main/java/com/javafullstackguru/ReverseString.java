package com.javafullstackguru;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Laxman";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}