package com.company;
import java.lang.String;
public class Char_Type {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            char big_letters = (char) ('А' + i);
            char small_letters = (char) ('а' + i);
            System.out.println(big_letters + "" + small_letters + ", ");
        }
    }
}