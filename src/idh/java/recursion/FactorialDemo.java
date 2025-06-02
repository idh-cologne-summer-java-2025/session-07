package idh.java.recursion;


/**
 * Klasse, die iterative und rekursive Berechnung der Fakultät umsetzt.
 */
public class FactorialDemo {

   
	public static int calculateFactorialIterative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Fakultät ist für negative Zahlen nicht definiert.");
        }
        if (number == 0) {
        	return 1;
        }
        int erg = 1;
        for(int i=number; i>0; i--) {
        	erg = erg*i;
        }
        return erg;
    }
	
    public static int calculateFactorialRecursive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Fakultät ist für negative Zahlen nicht definiert.");
        }
        if(number == 0) {
        	return 1;
        }
        number = number * calculateFactorialRecursive(number-1);
        return number;
    }

    public static void main(String[] args) {
        
        try {
            int number = 9;
        	System.out.println(calculateFactorialRecursive(number));
        	System.out.println(calculateFactorialIterative(number));
        } 
        catch (IllegalArgumentException e) {
            System.err.println("Ungültige Eingabe: " + e.getMessage());
        }
    }
}