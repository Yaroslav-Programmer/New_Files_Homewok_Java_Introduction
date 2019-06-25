package com.company;
import java.lang.String;
public class Char_Array {
    public static void main(String[] args) {
        String to_char_array = "Lorem ipsum";
        int word_counter = 0;
        for (char chars : to_char_array.toCharArray()) {
            if (chars == ' ') {
                word_counter++;
            }
        }
        System.out.println(word_counter);
    }
}