package com.javafullstackguru;

public class SortAlphabetOrderUsingUsingBubbleSort {
    public static void main(String[] args) {
        String s = "kubernates";
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        String str = new String(arr);
        System.out.println(str);
    }
}
