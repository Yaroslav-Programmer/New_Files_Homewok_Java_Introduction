package com.company;

import java.util.Scanner;
import java.lang.String;

public class CycleFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastNumber = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= lastNumber; i++) {
            sum += i;
        }
        System.out.println("Sum : " + sum);
    }
}