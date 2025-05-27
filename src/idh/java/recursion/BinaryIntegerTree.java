package idh.java.recursion;

/**
 * Klasse zum Speichern von int-Werten in einem sortierten Binärbaum
 */
public class BinaryIntegerTree{
	
	/**
	 * Innere Klasse, die einen int-Binärbaumknoten repräsentiert
	 */
	class BinaryIntegerTreeNode{
		
		public BinaryIntegerTreeNode(int value) {
			this.value = value;
		}
		
		BinaryIntegerTreeNode left;
		BinaryIntegerTreeNode right;
		int value;
		
		/**
		 * Rekursive Methode für das Hinzufügen von int-Werten
		 * @param value int-Wert
		 * @return true, wenn Wert hinzugefügt wurde, false, wenn er schon vorhandem war
		 */
		public boolean addValue(int value){
			//TODO: Implement!
			return true;
		}
	}
	
	/**
	 * Die Wurzel des Baums
	 */
	private BinaryIntegerTreeNode root;
	
	/**
	 * Methode für das Hinzufügen von int-Werten in den Baum
	 * @param value int-Wert
	 * @return true, wenn Wert hinzugefügt wurde, false, wenn er schon vorhandem war
	 */
	public boolean addValue(int value) {
		// TODO: Implement!
		return true;
	}
	
	/**
	 * Soll den Baum in der sortierten Reihenfolge ausgeben 
	 */
	public void printInOrder() {
		//TODO: Implement!
	}
	
	/**
	 * Überprüft, ob der spezifizierte Wert enthalten ist. 
	 */
	public boolean contains(int value) {
		//TODO: Implement!
		return false;
	}
}
