/*
* The challenge involves creating two methods.
*
* The first one should be called calculateHighScorePosition
* It should have one parameter, score which is an int
* The method should return a value that is calculated based
* on the score.
* 1 if the score is >= 1000
* 2 if the score is >= 500 and < 1000
* 3 if the score is >= 100 and < 500
* 4 in all other cases
*
* The second method should be called displayHighScorePosition
* it should have two parameters, name and position
* name is the players name and a String.
* position is the value returned from the first method and
* represents where in the high score table
* the players score belongs.
*
* This method does not return anything, rather, it outputs
* information about the player and the position.
* Output should be
* <Name> managed to get to position <Position> on the high score table.
* <Name> and <Position> would be replaced with the actual name
* and position passed to the method.
* If the arguments passed to displayHighScorePosition
* were Tim and 2, then the output should be
* Tim managed to get to position 2 on the high score table.
*
* call calculateHighScorePosition four times, passing the score
* 1500, 900, 400, and 50.
* Save the value returned from the method and pass it along with a player name
* to displayHighScorePosition.
*
* */


package com.fridaynightsoftwares;

public class MethodsChallenge {
    public static void main(String[] args) {
        int highScoreOne = calculateHighScorePosition(1500);
        displayHighScorePosition("Player 1", highScoreOne);

        int highScoreTwo = calculateHighScorePosition(900);
        displayHighScorePosition("Player 2", highScoreTwo);

        int highScoreThree = calculateHighScorePosition(400);
        displayHighScorePosition("Player 3", highScoreThree);

        // Passing a method in another methods parameter:
        displayHighScorePosition("Player 4", calculateHighScorePosition(50));
    }
    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get to position " + position + " on the high score table.");
    }
}
