package com.javafullstackguru;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindLargeNumberArrayJava81 {
    public static void main(String[] args) {
        int[] arr = {1,6,8,9,13,93};
        Optional<Integer> max = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(0).findFirst();
        System.out.println(max.get());
        Optional<Integer> min = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(5).findFirst();
        System.out.println(min.get());
    }
}
