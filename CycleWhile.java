package com.company;

import java.lang.String;

public class CycleWhile {
    public static void main(String[] args) {
        int i = 0;
        int counter = 0;
        while (i < 100) {
            if (i % 4 == 0 || i % 5 == 0) {
                System.out.println(i);
                counter++;
            }
            i++;
        }
        System.out.println("Count : " + counter);

    }
}

