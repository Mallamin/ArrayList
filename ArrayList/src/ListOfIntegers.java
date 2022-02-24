import java.util.ArrayList;
import java.util.List;

public class ListOfIntegers {

	public static void main(String[] args) {

		List<Integer> listOfIntegers1 = new ArrayList<Integer>();
		listOfIntegers1.add(23);
		listOfIntegers1.add(40);
		listOfIntegers1.add(100);
		listOfIntegers1.add(200);
		listOfIntegers1.add(1000);
		listOfIntegers1.add(4);
		listOfIntegers1.add(24);
		listOfIntegers1.add(56);
		listOfIntegers1.add(1);
		listOfIntegers1.add(9);

		// System.out.println("This is the first list of integers:"+listOfIntegers1);

		List<Integer> listOfIntegers2 = new ArrayList<Integer>();

		listOfIntegers2.add(7);
		listOfIntegers2.add(8);
		listOfIntegers2.add(3);
		listOfIntegers2.add(9);
		listOfIntegers2.add(6);
		listOfIntegers2.add(10);
		listOfIntegers2.add(12);
		listOfIntegers2.add(11);
		listOfIntegers2.add(13);
		listOfIntegers2.add(14);

		// System.out.println("This is the second list of integers:"+listOfIntegers2);
        //Combining the lists
		List<Integer> addedLists = new ArrayList<Integer>();
		addedLists.addAll(listOfIntegers1);
		addedLists.addAll(listOfIntegers2);

		System.out.println("This is the addedLists" + addedLists);
		
        // Getting the sum of all numbers in the combined list
		int total = 0;

		for (Integer number : addedLists) {

			total = total + number;

		}

		System.out.println(total);
		
		// Calculating the average 

		int average = total / addedLists.size();

		System.out.println(average);
		
		//Checking if the average is even or odd

		if (average % 2 == 0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");

	}

}
