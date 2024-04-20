package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindEvenNumberJava81 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::print);
        System.out.println("\n");
        list.stream().filter(n -> n % 2 != 0).forEach(System.out::print);
        System.out.println("\n");
        int sq = list.stream().mapToInt(n -> n * n).sum();
        System.out.print(sq);
        System.out.println("\n");
        int sq3 = list.stream().mapToInt(n -> n * n * n).sum();
        System.out.print(sq3);
        System.out.println("\n");
        int sum = list.stream().mapToInt(Integer::intValue).reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println("\n");
    }
}
