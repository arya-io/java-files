// Create a program to calculate the percentage of a user's score in relation to the maximum score in a game.

public class Score {

    public static void main(String[] args) {

        // Maximum score in the game
        int maxScore = 500;

        // User's score in the game
        int userScore = 423;

        // Calculate the percentage of user's score
        float percentage = (float) userScore / maxScore * 100.0f;

        // Print the percentage result
        System.out.println("User's percentage is " + percentage);
    }
}
