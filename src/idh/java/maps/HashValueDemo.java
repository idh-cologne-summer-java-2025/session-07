package idh.java.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Demonstriert, dass Hashcodes nicht den
 * Klartext speichern, aber durch ihn zu rekonstruieren sind.
 */
public class HashValueDemo{
	
	public static void main(String[] args) {
		
		String name = "hermesj";
		String password = "NICHTMEINPASSWORT!";
		Account account = new Account(name, password);
		
		// Passwort kann jetzt weggeschmissen werden und ist danach 
		// Nicht mehr im Klartext vorhanden.
		password = null;
		
		// Tests:
		System.out.println(account.login("NICHTMEINPASSWORT!"));
		System.out.println(account.login("DOCHMEINPASSWORT!"));
		System.out.println(account.login("1932784197"));
				
				
		Account a2 = new Account("anna", "geheim123");
        Account a3 = new Account("bernd", "passwort");
        Account a4 = new Account("clara", "123456");

        // Map zur Speicherung der Accounts
        Map<String, Account> accounts = new HashMap<>();
        accounts.put(account.name, account);
        accounts.put(a2.name, a2);
        accounts.put(a3.name, a3);
        accounts.put(a4.name, a4);

        // Nutzerinteraktion
        Scanner scanner = new Scanner(System.in);
        System.out.print("Benutzername: ");
        String benutzername = scanner.nextLine();

        System.out.print("Passwort: ");
        String eingabePasswort = scanner.nextLine();

        // Login-Prüfung
        Account test = accounts.get(benutzername);

        if (test != null && test.login(eingabePasswort)) {
            System.out.println("✅ Login erfolgreich. Willkommen, " + benutzername + "!");
        } else {
            System.out.println("❌ Login fehlgeschlagen. Benutzername oder Passwort falsch.");
        }

        scanner.close();
    }

}
