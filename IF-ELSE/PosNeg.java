// WAP to find out if a number is positive or negative

public class PosNeg {
    public static void main(String[] args) {

        // Define a number to check if it is positive or negative
        int myNum = 10;

        // Check if the number is positive, negative, or zero
        if (myNum > 0) {
            // If the number is greater than 0, it's positive
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            // If the number is less than 0, it's negative
            System.out.println("The value is a negative number.");
        } else {
            // If the number is 0
            System.out.println("The value is 0.");
        }

    }    
}
