package com.javafullstackguru;

public class SelectionSortExample {
    public static void main(String[] args) {
        int[] arr = {0, 5, 3, 6, 9, 2, 8};
        selectionSort(arr);
        printArray(arr);
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr){
            System.out.println(num+" ");
        }

    }
}
