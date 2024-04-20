package com.javafullstackguru;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberArray2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3};
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
                if (!set.add(num)){
                    System.out.print(num);
                }
            }
        System.out.println("\n");
        System.out.println(set);
        }
    }

