package idh.java.recursion;


/**
 * Klasse, die iterative und rekursive Berechnung der Fakultät umsetzt.
 */
public class FactorialDemo {

    // Calculates the factorial of a number using iteration (loop)
    public static int calculateFactorialIterative(int number) {
        // Factorial is not defined for negative numbers
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        // Base case: 0! is defined as 1
        if (number == 0) {
            return 1;
        }

        // Start with 1 and multiply downward from 'number' to 1
        int result = 1;
        for (int i = number; i > 0; i--) {
            result = result * i;
        }

        return result;
    }

    // Calculates the factorial of a number using recursion
    public static int calculateFactorialRecursive(int number) {
        // Factorial is not defined for negative numbers
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        // Base case: 0! is defined as 1
        if (number == 0) {
            return 1;
        }

        // Recursive step: n! = n * (n - 1)!
        return number * calculateFactorialRecursive(number - 1);
    }

    // Main method to test both implementations
    public static void main(String[] args) {
        try {
            int number = 9;

            // Call and print recursive factorial
            System.out.println("Recursive: " + calculateFactorialRecursive(number));

            // Call and print iterative factorial
            System.out.println("Iterative: " + calculateFactorialIterative(number));
        } 
        catch (IllegalArgumentException e) {
            // Handle invalid input gracefully
            System.err.println("Invalid input: " + e.getMessage());
        }
    }
}