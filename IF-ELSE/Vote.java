// Find out if a person is old enough to vote.

public class Vote {

    public static void main(String[] args) {

        // Variables to store the person's age and voting age
        int myAge = 25;
        int votingAge = 18;

        // Check if the person is old enough to vote
        if (myAge >= votingAge) {
            // If age is greater than or equal to voting age
            System.out.println("Old enough to vote!");
        } else {
            // If age is less than voting age
            System.out.println("Not old enough to vote.");
        }
    }
}
