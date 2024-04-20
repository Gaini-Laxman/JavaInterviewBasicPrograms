package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumberJava8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream().filter(n -> n % 2 == 0).toList().forEach(System.out::print);
        System.out.println("\n");
        list.stream().filter(n -> n % 2 != 0).toList().forEach(System.out::print);
        System.out.println("\n");
        int l = list.stream().mapToInt(Integer::intValue).reduce(0, Integer::sum);
        System.out.println("Sum :" + l);
        System.out.println("\n");
        list.stream().filter(n -> n >= 5).toList().forEach(System.out::print);
        System.out.println("\n");
        list.stream().filter(n -> n > 5).filter(n -> n < 8).toList().forEach(System.out::print);
        System.out.println("\n");
        int sumSquare = list.stream().mapToInt(n->n*n).sum();
        System.out.println(sumSquare);
    }
}
