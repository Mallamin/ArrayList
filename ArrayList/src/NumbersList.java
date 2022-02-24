import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersList {

	public static void main(String[] args) {
		List<Integer> listOfNumber = new ArrayList<Integer>();
		listOfNumber.add(7);
		listOfNumber.add(234);
		listOfNumber.add(300);
		listOfNumber.add(70);
		listOfNumber.add(1000);
		listOfNumber.add(20);
		listOfNumber.add(77);
		listOfNumber.add(90);
		listOfNumber.add(2021);
		listOfNumber.add(2022);

		Collections.sort(listOfNumber);

		System.out.println(listOfNumber);

	}

}
