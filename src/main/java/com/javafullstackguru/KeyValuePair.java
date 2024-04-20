package com.javafullstackguru;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class KeyValuePair {
    public static void main(String[] args) {
        String s = "Laxman";
        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach(((character, aLong) -> System.out.print(character+"-"+aLong+",")));
    }
}
