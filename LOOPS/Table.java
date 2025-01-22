// Create a program that prints the multiplication table for a specified number

public class Table {
    public static void main(String[] args) {

        // Define the number for which the multiplication table will be printed
        int number = 2;

        // Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            // Print the result of the multiplication
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
