package com.company;
import java.lang.String;
public class Exercise14 {
    public static int SplitAndSum(int dist) {
        int sum = 0;

        while (dist != 0) {
            sum += dist % 10;
            dist /= 10;
        }
        return sum;

    }

        public static void main(String[] args) {
            int distance = 473;
            System.out.println(SplitAndSum(distance)); // 4 + 7 + 3 = 14
        }
    }

