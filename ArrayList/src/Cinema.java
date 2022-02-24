

public class Cinema {

	private String Film;
	private int Ora;
	private int Prezzo;
	public String getFilm() {
		return Film;
	}
	public void setFilm(String film) {
		Film = film;
	}
	public int getOra() {
		return Ora;
	}
	public void setOra(int ora) {
		Ora = ora;
	}
	public int getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(int prezzo) {
		Prezzo = prezzo;
		
      
	}
	public Cinema(String film, int ora, int prezzo) {
		super();
		Film = film;
		Ora = ora;
		Prezzo = prezzo;
	}
	
	
	

}
