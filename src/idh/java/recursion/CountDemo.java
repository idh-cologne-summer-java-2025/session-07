package idh.java.recursion;

/**
 * Klasse, die hoch- und runterzählung von / zu einem spezifizierten 
 * Zahlenwert iterativ und rekursiv umsetzt.
 */
public class CountDemo {

	public static void main(String[] args) {
		// Call methods with the number 10
		countUpIterative(10);       // Iteratively count from 1 to 10
		countDownIterative(10);     // Iteratively count from 10 down to 0

		countDownRecursive(10);     // Recursively count from 10 down to 0
		countUpRecursive(10);       // Recursively count from 1 up to 10
	}

	// Iteratively counts from 1 up to the given end number
	private static void countUpIterative(int end) {
		System.out.println("Count up to " + end);
		for (int i = 1; i <= end; i++) {
			System.out.println(i);
		}
		System.out.println(); // Empty line for readability
	}

	// Iteratively counts down from the given start number to 0
	private static void countDownIterative(int start) {
		System.out.println("Count down to " + start);
		for (; start >= 0; start--) {
			System.out.println(start);
		}
		System.out.println(); // Empty line for readability
	}

	// Recursively counts down from the given start number to 0
	private static void countDownRecursive(int start) {
		System.out.println(start);
		if (start == 0) { // Base case: if start is 0, stop recursion
			return;
		}
		// Recursive call with one less
		countDownRecursive(start - 1);
	}

	// Recursively counts up from 1 to the given end number
	private static void countUpRecursive(int end) {
		if (end == 0) {
			return;
		}
		// First go down to 1 before printing, now every time sth is printed, 
		countUpRecursive(end - 1);
		/* 1. The method calls itself with `end - 1` each time, which goes deeper into the recursion (e.g., 3 → 2 → 1 → 0).
         * 2. When `end == 0`, the base case is reached and recursion stops.
         * 3. Then the function begins returning (unwinding the stack)
         * and each return prints the corresponding value of `end`.
		 */
		System.out.println(end); // Print after recursion — causes ascending order
	}
}