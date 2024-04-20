package com.javafullstackguru;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumberArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5};
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            if(!set.add(num)){
                System.out.print(num+" ");
            }
        }
    }
}
