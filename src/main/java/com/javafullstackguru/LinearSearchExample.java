package com.javafullstackguru;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 9, 1, 7};
        int target = 2;
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element : " + target + ", found at index :" + index);
        } else {
            System.out.println("Element : " + target + ", not found in the array");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
