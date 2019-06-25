package com.company;

import java.lang.String;

public class ArrayInt {
    public static void main(String[] args) {
        arr();

    }

    private static void arr() {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(numbers[0]);
    }
}