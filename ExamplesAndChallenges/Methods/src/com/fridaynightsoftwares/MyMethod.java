package com.fridaynightsoftwares;

public class MyMethod {
    public static void main(String[] args) {

        // Declaring the variables and assigning a value to them:
        boolean isGameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // Executing the method with these values:
        calculateScore(isGameOver, score, levelCompleted, bonus);

        // Changing some values for the variables:
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // Executing the method with the changed values:
        calculateScore(isGameOver, score, levelCompleted, bonus);

        // Executing the method is custom values as parameters:
        calculateScore(true, 100, 200, 100);

        // Executing the method with a return type int:
        int playerScore = calculateScoreWithReturnType(false, 100, 200, 300);
        System.out.println("Your final score was " + playerScore);
    }

    public static void calculateScore(boolean isGameOver, int score,
                                      int levelCompleted, int bonus) {
        if (isGameOver) {
            int finalScore = score + levelCompleted * bonus;
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static int calculateScoreWithReturnType(boolean isGameOver, int score,
                                                   int levelCompleted, int bonus) {
        int finalScore;
        if (isGameOver) {
            finalScore = score + levelCompleted * bonus;
            finalScore += 1000;
        } else {
            finalScore = -1;
        }
        return finalScore;
    }
}
