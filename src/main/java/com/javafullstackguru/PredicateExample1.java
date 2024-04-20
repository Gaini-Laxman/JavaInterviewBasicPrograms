package com.javafullstackguru;

import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {
        String[] arr = {"A", "AA", "B", "BB", "C", "CC"};
        Predicate<String> p = n -> n.charAt(0) == 'A';
        for (String name : arr) {
            if (p.test(name)) {
                System.out.println(name);
            }
        }
    }
}
