package com.javafullstackguru;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount1 {
    public static void main(String[] args) {
        String s = "laxman";

        //print l-1, a-2,x-1,n-1;
        Map<Character, Long> map = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((character, aLong) -> System.out.println(character+"-"+aLong));
    }
}
