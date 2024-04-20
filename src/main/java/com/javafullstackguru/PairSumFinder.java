package com.javafullstackguru;

import java.util.*;

public class PairSumFinder {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        findPairs(num, target);
    }

    public static void findPairs(int[] num, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int complement = target - num[i];
            if (map.containsKey(complement)) {
                System.out.println(num[i] + ", " + complement + " = " + target);
            }
            map.put(num[i], i);
        }
    }
}

