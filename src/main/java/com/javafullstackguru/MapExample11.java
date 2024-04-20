package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;

public class MapExample11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","AA","AAA","B","BB","BBB","C","CC","CCC");
        list.stream().filter(n->n.startsWith("A")).map(n->n+"-"+n.length()).forEach(System.out::println);

        }
    }

