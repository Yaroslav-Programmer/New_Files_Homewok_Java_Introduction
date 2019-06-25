package com.company;

import java.lang.String;

// java program for Pascal's Triangle
// A O(n^2) time and O(n^2) extra
// space method for Pascal's Triangle

// Java program for Pascal's Triangle
// A O(n^2) time and O(1) extra
// space method for Pascal's Triangle

class GFG {

    //Pascal function
    private static void printPascal(int n) {
        for (int line = 1; line <= n; line++) {

            int C = 1;// used to represent C(line, i)
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

    //Diver code
    public static void main(String[] args) {
        int n = 5;
        printPascal(n);
    }
}
// This code is contributed
