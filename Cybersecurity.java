package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;


public class Cybersecurity {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String [] bad_words = {"kill", "bomb", "murder", "terrorism", "gun"};
        System.out.println("Input something: ");
        String message = bufferedReader.readLine();

        for (String words:bad_words) {
            if(message.toLowerCase().contains(words)){
                System.out.println("Criminal!");
                break;
            }
        }

    }
}