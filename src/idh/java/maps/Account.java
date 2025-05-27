package idh.java.maps;

/**
 * Klasse zur Repräsentation von Account-Daten
 */
public class Account{
	String name;
	int passwordhash;
	
	public Account(String name, String password) {
		super();
		this.name = name;
		this.passwordhash = password.hashCode();
	}
	
	public boolean login(String password) {
		// Achtung: String.hashCode() soll hier nur demonstrieren, dass man Passwörter nicht im Klartext speichern muss
		// Es ist nämlich kryptografisch nicht sicher, dafür gibt es andere Verfahren!	
		// Stattdessen kann man bcrypt oder SHA-256 verwenden
		return this.passwordhash==password.hashCode();
	}
	
	
}