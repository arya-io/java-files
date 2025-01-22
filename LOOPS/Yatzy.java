// Yatzy Game

public class Yatzy {

    public static void main(String[] args) {

        // Initialize the dice value
        int dice = 1;

        // Use a while loop to simulate rolling dice
        while (dice <= 6) {

            // Check if the dice is less than 6
            if (dice < 6) {
                // If dice is not 6, it's not Yatzy
                System.out.println("No Yatzy.");
            } else {
                // If dice is 6, print "Yatzy!"
                System.out.println("Yatzy!");
            }

            // Increment the dice value by 1
            dice = dice + 1;
        }
    }
}