package com.javafullstackguru;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = {1, 6, 5, 4, 8, 9};
        InsertionSort(arr);
        printArray(arr);
    }
    private static void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
