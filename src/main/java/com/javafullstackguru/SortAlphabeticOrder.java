package com.javafullstackguru;

import java.util.Arrays;

public class SortAlphabeticOrder {
    public static void main(String[] args) {
        String word = "kubernatesdocker";
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);
        System.out.println(str);
    }
}
