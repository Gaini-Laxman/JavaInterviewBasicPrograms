package com.javafullstackguru;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateNumberArrayJava8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4};
        Stream<Integer> stream = Arrays.stream(arr).boxed().distinct();
        List<Integer> distinct = stream.toList();
        System.out.print(distinct);
    }
}
