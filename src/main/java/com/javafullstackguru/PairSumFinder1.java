package com.javafullstackguru;

import java.util.HashMap;
import java.util.Map;

public class PairSumFinder1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 6;
        findPairs(arr, target);
    }

    public static void findPairs(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println(arr[i] + ", " + complement + " = " + target);
            }
            map.put(arr[i], i);
        }
    }
}
