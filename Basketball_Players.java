package com.company;

import java.lang.String;

public class Basketball_Players {
    public static void main(String[] args) {
        int[] players = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        pointsOfPlayers(players);
    }

    private static int pointsOfPlayers(int[] players) {
        int mainPoints = 0;
        int secondaryPoints = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                mainPoints += players[i];
            } else {
                secondaryPoints += players[i];
            }
        }
        System.out.println("Difference in points are: " + Math.abs(mainPoints - secondaryPoints) + " points");
        return mainPoints - secondaryPoints;
    }
}