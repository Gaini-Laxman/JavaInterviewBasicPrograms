package com.javafullstackguru;

import java.util.Arrays;

public class SortAlphabeticOrder1 {
    public static void main(String[] args) {
        String word = "anitha";
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);
        System.out.println(str);
    }
}
