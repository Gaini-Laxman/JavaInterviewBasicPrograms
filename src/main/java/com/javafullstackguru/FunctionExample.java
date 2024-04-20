package com.javafullstackguru;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        //Function<String, Integer> f= (n)->n.length();
        //System.out.println(f.apply("laxman"));
        int[] num ={10,20};
        Function<int[], Integer> f = (sum) -> sum[0]+sum[1];
        System.out.println(f.apply(num));
    }
}
