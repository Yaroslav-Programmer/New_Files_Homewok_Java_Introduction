package com.company;
import java.lang.String;
public class loop1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
                continue;
            } else {
                System.out.println(i);
            }
        }
    }
}
