import java.util.ArrayList;
import java.util.List;

public class EsercizioArray {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		int[] numbers1 = new int[] { 1, 2, 3, 4, 5 };
//		for (int i = 0; i < numbers1.length; i++) {
//			System.out.println(numbers1[i]);
//		}
//		int i = 0;
//		while (i < numbers1.length) {
//			System.out.println(numbers1[i++]);
//
//		}
		List<String> numbers2 = new ArrayList<String>();
		numbers2.add("1");
		numbers2.add("2");
		
		for(String numero : numbers2) {
		System.out.println(numero);
	}
	
		List<Cinema> lista_di_cinema =new ArrayList<Cinema>();
		lista_di_cinema.add(new Cinema("Massimo", 2022, 14));
		lista_di_cinema.add(new Cinema("Denny", 2023, 17));
		lista_di_cinema.add(new Cinema("Dani", 2040, 18));
		
		lista_di_cinema.size();
		
	}

	
}
