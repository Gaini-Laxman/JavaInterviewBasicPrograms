package com.javafullstackguru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Laxman");
        map.put(102, "Anitha");
        map.put(103, "Vikramaditya");

        //print key value
         List<Map.Entry<Integer, String>> keyValue = new ArrayList<>(map.entrySet());
        System.out.println(keyValue);

        //print only values
        List<String> value = new ArrayList<>(map.values());
        System.out.println(value);

        //print keys
        List<Integer> key = new ArrayList<>(map.keySet());
        System.out.println(key);

    }
}
