package com.company;
import java.lang.String;
public class Copy_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = copyArr(arr1);

    }

    public static int[] copyArr(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            if (i % 2 == 0) {
                arr2[i] *= 2;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("Link: " + arr);
        for (int num2 : arr2) {
            System.out.print(num2 + " ");
        }
        return arr2;
    }
}
