package com.company;

import java.lang.String;
import java.util.Scanner;

public class Array_Ints_Strings {
    public static final Scanner scanner = new Scanner(System.in);
    private static final int MAX_VALUE = 10;

    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        int[] array = new int[MAX_VALUE];
        String[] strings = new String[MAX_VALUE];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Input string elements of array: ");
            String s = scanner.nextLine();
            strings[i] = s;
        }
        for (int i = 0; i <array.length ; i++) {
            array[i] = strings[i].length();
            System.out.println(array[i]);
        }
    }
}
/*
Массивы 6:
        1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
        Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
 */