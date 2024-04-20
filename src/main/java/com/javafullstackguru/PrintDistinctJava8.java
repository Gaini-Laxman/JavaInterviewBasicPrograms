package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDistinctJava8 {
    public static void main(String[] args) {
        String s = "Laxman";
        List<Character> list = s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
        list.stream().distinct().forEach(System.out::print);
    }
}
