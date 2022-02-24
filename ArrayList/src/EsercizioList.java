import java.util.ArrayList;
import java.util.List;

public class EsercizioList {
	public static void main(String[] args) {

		List<Studenti> lista_di_studenti = new ArrayList<Studenti>();
		lista_di_studenti.add(new Studenti("Mohamed Lamin", " Jalloh", 14, "Maschio"));
		lista_di_studenti.add(new Studenti("Ibrahim", "Babangida", 17, "Maschio"));
		lista_di_studenti.add(new Studenti("Musa", "Yar'Adua", 18, "Maschio"));
		lista_di_studenti.add(new Studenti("Hawa", "Sidibe", 9, "Femmine"));
		lista_di_studenti.add(new Studenti("Bilkis", "Barry", 10, "Femmine"));
		lista_di_studenti.add(new Studenti("Binta", "Jalloh", 1, "Femmine"));
		lista_di_studenti.add(new Studenti("Fatima", "Bah", 6, "femmine"));
		lista_di_studenti.add(new Studenti("Alhaji", "Jalloh", 12, "Maschio"));
		lista_di_studenti.add(new Studenti("Saliou", "Timbo", 15, "Maschio"));
		lista_di_studenti.add(new Studenti("Thierno", "Balde", 8, "Maschio"));

		List<Studenti> StudentiMaschi = new ArrayList<Studenti>();
		List<Studenti> StudentiFemmine = new ArrayList<Studenti>();

		for (Studenti student : lista_di_studenti) {

			if ("Maschio".equals(student.getSesso())) {

				StudentiMaschi.add(student);
			} else {

				StudentiFemmine.add(student);
			}

		}
		
		

		System.out.println("Queste studenti sono maschi:\n\n" + StudentiMaschi);
		System.out.println("\n");
		System.out.println("Queste studente sono feminile:\n\n" + StudentiFemmine);

	}

}
