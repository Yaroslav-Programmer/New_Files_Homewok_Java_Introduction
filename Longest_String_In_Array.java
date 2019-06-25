package com.company;

import java.util.Scanner;
import java.lang.String;

public class Longest_String_In_Array {
    private static Scanner scanner = new Scanner(System.in);
    private static final int MAX_QUANTITY_OF_LINES = 5;

    public static void main(String[] args) {
        String[] array = new String[MAX_QUANTITY_OF_LINES];

        int len = fillArray(array);
        printStrings(len, array);
    }

    private static int fillArray(String[] array) {

        System.out.println("Input 5 strings: ");
        int string_length = 0;
        int max_quantity_of_lines = 0;

        for (int i = 0; i < MAX_QUANTITY_OF_LINES; i++) {
            array[i] = scanner.nextLine();
            string_length = array[i].length();
        }
        if (string_length > max_quantity_of_lines) {
            max_quantity_of_lines = string_length;
        }
        return max_quantity_of_lines;
    }

    private static void printStrings(int len, String[] array) {
        for (int i = 0; i < MAX_QUANTITY_OF_LINES; i++) {
            if (array[i].length() == len) {
                System.out.println("The longest string : " + array[i]);
            }
        }
    }
}