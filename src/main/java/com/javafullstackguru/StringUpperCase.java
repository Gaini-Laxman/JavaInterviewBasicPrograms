package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;

public class StringUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana","Apple","Cherry");
        list.stream().map(String::toUpperCase).toList().forEach(System.out::println);
        list.stream().map(String::toLowerCase).toList().forEach(System.out::println);

    }
}
