package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;

public class CharacterWithCount1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana","apple","cherry","appricot","avacado");
        list.stream().filter(n->n.startsWith("a")).map(n->n+"-"+n.length()).forEach(System.out::println);
    }
}
