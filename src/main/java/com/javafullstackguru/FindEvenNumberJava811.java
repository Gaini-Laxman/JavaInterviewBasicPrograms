package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumberJava811 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::print);
        System.out.println("\n");
        list.stream().filter(n -> n % 2 != 0).forEach(System.out::print);
        System.out.println("\n");
        list.stream().filter(n -> n > 6).forEach(System.out::print);
        System.out.println("\n");
        list.stream().filter(n -> n < 6).forEach(System.out::print);
        System.out.println("\n");
        list.stream().filter(n -> isPrime(n)).forEach(System.out::print);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }
}
