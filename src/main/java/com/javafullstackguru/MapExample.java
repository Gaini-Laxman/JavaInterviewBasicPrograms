package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("uk", "us","india","japan");
        list.stream().map(n->n.toUpperCase()).forEach(System.out::println);
        list.stream().map(n->n.toUpperCase()).map(n->n+"-"+n.length()).forEach(System.out::println);
    }
}
