package math.problems;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("Enter a positive number");
        } else {
            long factorialRecursive = calculateFactorialRecursive(number);
            long factorialIterative = calculateFactorialIterative(number);

            System.out.println("Factorial using recursion: " + factorialRecursive);
            System.out.println("Factorial using iteration: " + factorialIterative);
        }
    }

    public static long calculateFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorialRecursive(n - 1);
    }

    public static long calculateFactorialIterative(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
