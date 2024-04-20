package com.javafullstackguru;


public class BubbleSortExample1 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 6, 2, 3, 1, 9, 0};
        bubblrSort(arr);
        printArray(arr);
    }

    private static void bubblrSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
