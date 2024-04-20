package com.javafullstackguru;

public class StringConstantPool {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello").intern();
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
    }
}
