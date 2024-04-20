package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindDuplicateNumberArrayJav81 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,4,5,6,7,8};
        Stream<Integer> stream = Arrays.stream(arr).boxed().distinct();
        List<Integer> list = stream.toList();
        System.out.println(list);
    }
}
