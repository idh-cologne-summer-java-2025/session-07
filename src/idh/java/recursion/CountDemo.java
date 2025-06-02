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
		System.out.println("Count down to " + start);
		for(; start>=0; start--) {
			System.out.println(start);
		}
		System.out.println();
	}

	private static void countDownRecursive(int start) {
		System.out.println(start);
		if(start==0) {
			return;
		}
		countDownRecursive(start-1);
	}

	private static void countUpRecursive(int end) {
		if(end==0) {
			return;
		}
		countUpRecursive(end-1);
		System.out.println(end);
	}

}
