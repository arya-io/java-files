// Use recursion to add all of the numbers up to 10.

public class Sum {

    public static void main(String[] args) {
        // Call the recursive sum method and print the result
        int result = sum(10);
        System.out.println(result);
    }

    // Recursive method to calculate the sum of numbers from k down to 0
    public static int sum(int k) {
        // If k is greater than 0, recursively add k and call sum(k-1)
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            // Base case: if k is 0, return 0
            return 0;
        }
    }
}
