package com.javafullstackguru;

import java.util.Arrays;
import java.util.List;

public class MapExample1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anuska", "Anupama", "Annapurna","Anitha","Laxman","Laleetha", "Vikramaditya","Vineeth");
        list.stream().filter(n->n.startsWith("L")).map(n->n.toUpperCase()).map(n->n+"-"+n.length()).forEach(System.out::println);
    }
}
