package com.javafullstackguru;

public class FibonacciSeriesIterative {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the series
        System.out.println("Fibonacci Series (Iterative):");
        fibonacciSeries(n);
    }
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
