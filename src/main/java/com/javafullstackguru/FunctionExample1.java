package com.javafullstackguru;

import java.util.function.Function;

public class FunctionExample1 {
    public static void main(String[] args) {
        Function<String, Integer> f = String::length;
        System.out.println(f.apply("laxman"));
        System.out.println("====================================================");
        System.out.println("\n");
        int[] arr = {100890, 890};
        Function<int[], Integer> sum1 = (sum) -> sum[0] - sum[1];
        System.out.println("Substraction : "+sum1.apply(arr));
    }
}
