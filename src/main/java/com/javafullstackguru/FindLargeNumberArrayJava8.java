package com.javafullstackguru;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindLargeNumberArrayJava8 {
    public static void main(String[] args) {
        int[] arr = {10, 23, 45, 6, 77, 99};
       List<Integer> list = Arrays.asList(10, 23, 45, 6, 77, 99);

        Optional<Integer> highest = list.stream().collect(Collectors.maxBy(Comparator.comparing(i->i.intValue())));
        System.out.println(highest.get());
        Optional<Integer> high = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(0).findFirst();
        System.out.println(high.get());
    }
}
