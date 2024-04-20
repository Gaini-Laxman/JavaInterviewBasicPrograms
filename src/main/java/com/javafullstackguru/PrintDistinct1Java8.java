package com.javafullstackguru;

import java.util.List;
import java.util.stream.Collectors;

public class PrintDistinct1Java8 {
    public static void main(String[] args) {
        String s = "laxman";
                List<Character> list = s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
                list.stream().distinct().forEach(System.out::print);
    }
}
