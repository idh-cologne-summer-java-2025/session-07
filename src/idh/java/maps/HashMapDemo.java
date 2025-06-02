package idh.java.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
        System.out.println();
        // Prüfen, ob Bernd vorhanden ist
        
        System.out.println(telefonbuch.containsKey("Bernd"));
        System.out.println();
        // Clara entfernen
        
        telefonbuch.remove("Clara");
        
        // Noch eine Anna hinzufügen, mit anderer Nummer
        String inMap = telefonbuch.put("Anna", "0123-NEUENUMMER");
        System.out.println("War in Map: " + inMap);
        
        // Alle Einträge ausgeben
        Set<String> keySet = telefonbuch.keySet();
        for (String string : keySet) {
			System.out.println(string + ": " + telefonbuch.get(string));
		}
        System.out.println(telefonbuch);
	}
}


