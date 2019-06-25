package com.company;

import java.lang.String;

public class Arrays {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {23, 78, 65, 78},
                {23, 78, 65, 78},
                {23, 78, 65, 78}
        };

        arr[1][1] = 234;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }


        // int [] arr = new int [] {56, 489, 325, 678};
        // for(int i = 0; i<4; i++){
        // System.out.println("Element " + i + " is " + arr[i]);
    }

}

