package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;

public class CharacterWithCount {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mango","banana","cherry","graps");
        list.stream().map(n->n+"-"+n.length()).forEach(System.out::println);
    }
}
