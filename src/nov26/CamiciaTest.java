package nov26;

public class CamiciaTest {

	public static void main(String[] args) {
		Camicia miaCamicia; // dichiaro un oggetto di tipo Camicia
		miaCamicia = new Camicia(); // creo l'oggetto miaCamicia riferito alla classe Camicia
		
		// inizializzazione dell'oggetto (perché altrimenti è identico alla classe di partenza)
		miaCamicia.camiciaID = 1234; // posso assegnare i valori perché i campi sono public
		miaCamicia.descrizione = "Modello elegante in seta"; // ricordarsi delle virgolette per i testi!
		miaCamicia.codiceColore = 'G'; // ricordarsi degli apici per i char!
		miaCamicia.prezzo = 45.75; // per i decimali si usa il punto
		miaCamicia.disponibili = 8;
		
		miaCamicia.mostra(); // stampo il riepilogo con tutte le caratteristiche dell'oggetto miaCamicia
	}

}