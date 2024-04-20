package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AAA","BBB,","CCC");
        list.stream().forEach(System.out::println);
    }
}
