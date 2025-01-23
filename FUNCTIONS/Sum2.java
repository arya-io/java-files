// Use recursion to add all of the numbers between 5 to 10.

public class Sum2 {

    public static void main(String[] args) {

        // Call the recursive sum method and print the result
        int result = sum(5, 10);
        System.out.println(result);
    }

    // Recursive method to calculate the sum from 'end' down to 'start'
    public static int sum(int start, int end) {

        // If end is greater than start, keep summing recursively
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            // Base case: when end equals start, return end
            return end;
        }
    }
}
