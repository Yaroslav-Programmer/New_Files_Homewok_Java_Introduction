package com.company;

import java.lang.String;
import java.util.Scanner;

public class Criminals_Indexes_1 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input your name: (first name surname) space between name and surname");
        String name = scanner.nextLine();
        System.out.println("Prisoner number: " + prisonerNumber(name));
    }

    private static int prisonerNumber(String name) {
        int index = 0;
        for (char chars : name.toUpperCase().toCharArray()) {
            if (Character.isLetter(chars)) {
                index = index + chars;
            }
        }
        return index;
    }
}
