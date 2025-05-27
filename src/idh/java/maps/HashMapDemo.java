package idh.java.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstriert den Einsatz einer HashMap für ein Telefonbuch
 */
public class HashMapDemo {

	public static void main(String[] args){
		
		// Eine Map erstellen: Name → Telefonnummer
        Map<String, String> telefonbuch = new HashMap<String, String>();

        // Einträge hinzufügen
        telefonbuch.put("Anna", "0123-456789");
        telefonbuch.put("Bernd", "0987-654321");
        telefonbuch.put("Clara", "0111-222333");

        // Telefonnummer von Anna abrufen

        System.out.println(telefonbuch.get("Anna"));
        
        // Prüfen, ob Bernd vorhanden ist
        
        System.out.println(telefonbuch.containsKey("Bernd"));

        // Clara entfernen
        
        telefonbuch.remove("Clara");
        
        
        // Noch eine Anna hinzufügen, mit anderer Nummer
     
        
        // Alle Einträge ausgeben
        
	}
}


