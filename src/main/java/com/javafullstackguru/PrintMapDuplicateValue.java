package com.javafullstackguru;

import java.util.HashMap;
import java.util.Map;

public class PrintMapDuplicateValue {

    public static void main(String[] args) {
        // Creating Map1
        Map<String, String> map1 = new HashMap<>();
        map1.put("Key1", "1");
        map1.put("Key2", "2");
        map1.put("Key3", "3");
        map1.put("Key4", "4");

        // Creating Map2
        Map<String, String> map2 = new HashMap<>();
        map2.put("Key3", "3");
        map2.put("Key4", "4");
        map2.put("Key5", "5");
        map2.put("Key6", "6");

        // Printing value associated with "Key3" from both maps using Java 8 features
        map1.entrySet().stream()
                .filter(entry -> entry.getKey().equals("Key3"))
                .forEach(entry -> System.out.println("Value from Map1: " + entry.getValue()));

        map2.entrySet().stream()
                .filter(entry -> entry.getKey().equals("Key3"))
                .forEach(entry -> System.out.println("Value from Map2: " + entry.getValue()));
    }
}


