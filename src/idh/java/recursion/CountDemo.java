package idh.java.recursion;

/**
 * Klasse, die hoch- und runterzählung von / zu einem spezifizierten 
 * Zahlenwert iterativ und rekursiv umsetzt.
 */
public class CountDemo {

	public static void main(String[] args) {
		countUpIterative(10);
		countDownIterative(10);
		
		countDownRecursive(10);
		countUpRecursive(10);

	}

	private static void countUpIterative(int end) {
		System.out.println("Count up to " + end);
		for(int i=1; i<=end;i++) {
			System.out.println(i);
		}
		System.out.println();
	}

	private static void countDownIterative(int start) {
		
	}

	private static void countDownRecursive(int start) {
		
	}

	private static void countUpRecursive(int end) {
		
	}

}
