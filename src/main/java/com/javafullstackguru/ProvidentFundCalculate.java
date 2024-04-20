package com.javafullstackguru;

import java.util.Scanner;

public class ProvidentFundCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Salary");
        double basicSalary = sc.nextDouble();
        double providentFund = basicSalary * 0.12;
        System.out.println("pf :"+providentFund);
    }
}
