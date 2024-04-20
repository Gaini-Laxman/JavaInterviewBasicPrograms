package com.javafullstackguru;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxLegth1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana","kiwi-fruit","apple");
        list.stream().max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);
    }
}
