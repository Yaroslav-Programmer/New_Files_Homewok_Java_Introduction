package com.company;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;

public class HashTable {
    public static void main(String[] args) {
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('М', 0);
        numbers.put('Ж', 0);
        numbers.put('В', 0);
        numbers.put('О', 0);
        numbers.computeIfPresent('М', (k, v) -> v + 1 );
        System.out.println(numbers.get('М'));

        Map<String, Integer> words = new HashMap<>();
        words.put("hello", 3);
        words.put("world", 4);
        words.computeIfPresent("hello", (k, v) -> v + 1);
        System.out.println(words.get("hello"));
    }
}