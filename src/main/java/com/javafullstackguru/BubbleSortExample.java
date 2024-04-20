package com.javafullstackguru;


public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 3, 8};
        //print 2,3,5,7,8
        bubbleSort(arr);
        printArray(arr);
    }

    private static void bubbleSort(int[] arr) {
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
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
