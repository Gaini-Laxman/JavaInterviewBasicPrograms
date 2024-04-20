package com.javafullstackguru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Laxman");
        map.put(102, "Anitha");
        map.put(103, "Vikramaditya");
        map.put(104, "Mounika");
        map.put(105,"Karthik");
        map.put(106,"Anand");
        List<String> list = new ArrayList<>(map.values());
        System.out.println(list);
    }
}
