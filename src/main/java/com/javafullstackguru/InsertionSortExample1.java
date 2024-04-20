package com.javafullstackguru;

public class InsertionSortExample1 {
    public static void main(String[] args) {
        int[] arr = {0, 5, 7, 8, 4, 3, 2, 1};
        insertionSort(arr);
        printArray(arr);
    }
    private static void insertionSort(int[] arr) {
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
        for (int num : arr){
            System.out.print(num+" ");
        }
    }
}
