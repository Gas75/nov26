package nov26;

public class Camicia {
	// variabili globali, variabili d'istanza oppure campi
	public int camiciaID; // variabile numerica intera, tipo pertinente int
	public String descrizione = "-descrizione mancante-"; // variabile testuale, tipo pertinente String
	// codici colore: R = red, G = green, B = blue, W = white, U = unset (non specificato)
	public char codiceColore = 'U'; // variabile carattere singolo, tipo pertinente char
	public double prezzo; // variabile numerica decimale, tipo pertinente double
	public int disponibili; // variabile numerica intera, tipo pertinente int
	
	// metodo di stampa delle caratteristiche della camicia
	public void mostra() {
		System.out.println("ID della camicia: " + camiciaID);
		System.out.println("Descrizione: " + descrizione);
		System.out.println("Codice colore: " + codiceColore);
		System.out.println("Prezzo unitario: " + prezzo + " euro");
		System.out.println("Pezzi disponibili: " + disponibili);
	} // fine del metodo
	
} // fine della classe