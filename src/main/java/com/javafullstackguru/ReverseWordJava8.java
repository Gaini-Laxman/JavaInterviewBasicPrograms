package com.javafullstackguru;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReverseWordJava8 {
    public static void main(String[] args) {
        String s = "AAA,BBB,CCC";

        Optional<String> reverse = Arrays.stream(s.split(","))
                .map(String::trim)
                .collect(Collectors
                        .collectingAndThen(Collectors.toList(), l -> l.stream()
                                .reduce((a, b) -> b + "," + a)));
        System.out.println(reverse.get());
    }
}
