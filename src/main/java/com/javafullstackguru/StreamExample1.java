package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 34,56,23,67);
        list.stream().filter(i->i>30).forEach(System.out::println);
    }
}
