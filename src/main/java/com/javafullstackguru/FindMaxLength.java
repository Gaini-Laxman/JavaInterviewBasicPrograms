package com.javafullstackguru;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxLength {
    public static void main(String[] args) {
        List<String> maxLength = Arrays.asList("apple", "banana", "pine-apple");
        maxLength.stream().max(Comparator.comparingInt(String::length)).stream().forEach(System.out::println);

    }
}
