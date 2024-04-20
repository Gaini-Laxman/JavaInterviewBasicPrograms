package com.javafullstackguru;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KeyValuePair1 {
    public static void main(String[] args) {
        String s = "freedom";
        Map<Character, Long> map = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.print(map);
        System.out.println("\n");
        map.forEach(((character, count) -> System.out.println(character+"-"+count)));
    }
}
