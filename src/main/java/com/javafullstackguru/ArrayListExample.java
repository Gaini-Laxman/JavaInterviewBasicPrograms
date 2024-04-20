package com.javafullstackguru;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Adding an element at a specific index
        numbers.add(2, 25);

        // Accessing elements in the ArrayList using get() method
        System.out.println("Element at index 1: " + numbers.get(1));

        // Updating an element at a specific index
        numbers.set(3, 35);

        // Removing an element at a specific index
        numbers.remove(2);

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + numbers.size());

        // Iterating over the ArrayList using a for loop
        System.out.println("Elements of the ArrayList:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Iterating over the ArrayList using a for-each loop
        System.out.println("Elements of the ArrayList (using for-each loop):");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}

