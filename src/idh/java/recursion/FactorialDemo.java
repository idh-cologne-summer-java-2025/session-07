package idh.java.recursion;


/**
 * Klasse, die iterative und rekursive Berechnung der Fakultät umsetzt.
 */
public class FactorialDemo {

   
	public static int calculateFactorialIterative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Fakultät ist für negative Zahlen nicht definiert.");
        }
        
        // TODO: Implement!
        return 0;
    }
	
    public static int calculateFactorialRecursive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Fakultät ist für negative Zahlen nicht definiert.");
        }
        
        // TODO: Implement!
        return 0;
    }

    public static void main(String[] args) {
        
        try {
            int number = 5;
        	System.out.println(calculateFactorialRecursive(number));
        	System.out.println(calculateFactorialIterative(number));
        } 
        catch (IllegalArgumentException e) {
            System.err.println("Ungültige Eingabe: " + e.getMessage());
        }
    }
}