package com.company;
import java.lang.String;
public class Aliens {
    public static void main(String[] args) {
        int n = 1426789167;
        foo(n);
    }

    private static int foo(int n) {
        int d = 0;
        int max = 0;

        while (n != 0) {
            System.out.println(n % 10);
            d = n % 10;
            if (max < d)
                max = d;
            n /= 10;
        }
        System.out.println("Maximum value: " + max);
        return max;

    }
}