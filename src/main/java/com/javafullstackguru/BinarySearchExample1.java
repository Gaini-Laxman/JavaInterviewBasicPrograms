package com.javafullstackguru;

import java.util.Arrays;

public class BinarySearchExample1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 9, 4, 0};
        int target = 6;
        Arrays.sort(arr);
        int index = binarySearch(arr, target);
        if (index != 0) {
            System.out.println(target + ", Found at" + index);
        } else {
            System.out.println(target + "Not found in the array");
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
