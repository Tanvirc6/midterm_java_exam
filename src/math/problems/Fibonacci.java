package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        // Declare and limit the number of Fibonacci numbers to generate
        int n = 40; // Number of Fibonacci numbers to generate
        long[] fibonacciNumbers = new long[n];

        // Initialize the first two Fibonacci numbers
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        // Generate the rest of the Fibonacci numbers
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        // Print the Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i]);

            // Add a comma and space unless it's the last number
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }
}