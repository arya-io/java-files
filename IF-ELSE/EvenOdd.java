// WAP to find out if a number is even or odd

public class EvenOdd {

    public static void main(String[] args) {

        // Define a number to check if it is even or odd
        int myNum = 5;

        // Check if the number is divisible by 2 (even)
        if (myNum % 2 == 0) {
            // If the remainder is 0, it's an even number
            System.out.println(myNum + " is even");
        } else {
            // Otherwise, it's an odd number
            System.out.println(myNum + " is odd");
        }
    }
}
