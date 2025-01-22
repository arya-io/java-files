// Create a simple "countdown" program

public class CountDown {

    public static void main(String[] args) {

        // Initialize the countdown starting value
        int countdown = 3;

        // Use a while loop to count down to 0
        while (countdown > 0) {
            // Print the current countdown value
            System.out.println(countdown);
            // Decrease the countdown value by 1
            countdown--;
        }

        // Print a message when the countdown is complete
        System.out.println("Happy New Year!!");
    }
}