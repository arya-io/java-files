// Create a program that calculates the average of different ages

public class Average {

    public static void main(String[] args) {

        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // Initialize sum and average variables
        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the array and calculate the sum of ages
        for (int age : ages) {
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average age is: " + avg);
    }
}
