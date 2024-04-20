package com.javafullstackguru;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 8, 2, 3, 1};
        int target = 2;

        // Sort the array
        Arrays.sort(arr);

        int index = BinarySearch(arr, target);
        if (index != -1) {
            System.out.println(target + ", Found at Index : " + index);
        } else {
            System.out.println(target + ", Not found in the array");
        }
    }

    private static int BinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; // Return index when element is found
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if element is not found
    }
}
