package com.javafullstackguru;

import java.util.function.Predicate;

public class PredicateExample11 {
    public static void main(String[] args) {
        String[] arr = {"Anitha", "Anusha", "Laxman", "Laleetha", "Vikramaditya", "vineeth"};
        Predicate<String> p = n -> n.charAt(0) == 'A';
        for (String name : arr) {
            if (p.test(name)) {
                System.out.println(name);
            }
        }
    }
}
