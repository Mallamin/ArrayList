import java.util.ArrayList;
import java.util.List;

public class ListOfPersons {

	public static void main(String[] args) {

		List<String> info = new ArrayList<String>();
		info.add("via roma");
		info.add("101");
		info.add("codicefdgffdgdfg");

		List<String> info1 = new ArrayList<String>();
		info1.add("via Giordano Bruno ");
		info1.add("178");
		info1.add("cf098766687789");

		List<String> info2 = new ArrayList<String>();
		info2.add("via Mali ");
		info2.add("102");
		info2.add("cf00987766655");

		List<String> info3 = new ArrayList<String>();
		info3.add("via Inghilteria ");
		info3.add("140");
		info3.add("cf0090000000000000000");

		List<String> info4 = new ArrayList<String>();
		info4.add("via Francia ");
		info4.add("234");
		info4.add("cf00987766655000000");

		List<String> info5 = new ArrayList<String>();
		info5.add("via Guinea ");
		info5.add("160");
		info5.add("cf009878888888888");

		List<String> info6 = new ArrayList<String>();
		info6.add("via Italia ");
		info6.add("198");
		info6.add("cf00987111111111111");

		List<String> info7 = new ArrayList<String>();
		info7.add("via Costa Davorio ");
		info7.add("170");
		info7.add("cf009877666444");

		List<Person> listOfPersons = new ArrayList<Person>();
		listOfPersons.add(new Person("Musa", "Jalloh", 15, info));
		listOfPersons.add(new Person("Ibrahim", "Ture", 17, info1));
		listOfPersons.add(new Person("Sana", "Jah", 16, info2));
		listOfPersons.add(new Person("Saj", "Diallo", 9, info3));
		listOfPersons.add(new Person("Mariam", "Bah", 10, info4));
		listOfPersons.add(new Person("Kindy", "Sow", 1, info5));
		listOfPersons.add(new Person("Oumou", "Sall", 6, info6));
		listOfPersons.add(new Person("Samsoudine", "Magassouba", 12, info7));



		Person[] individual = new Person[listOfPersons.size()];
		individual = listOfPersons.toArray(individual);

		for (Person person : individual) {

			if ((person.getAge() >= 9) && (person.getAge() <= 15)
					&& (Integer.parseInt(person.getInfo().get(1)) < 143)) {

				listOfPersons.remove(person);

			}

		}
		System.out.println(listOfPersons);
	}
}
