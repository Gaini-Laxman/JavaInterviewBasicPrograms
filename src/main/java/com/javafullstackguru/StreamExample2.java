package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB", "C", "CC", "CCC");
        list.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);
    }
}
