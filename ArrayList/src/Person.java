import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private String surname;
	private int age;
	private List<String> info = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getInfo() {
		return info;
	}

	public void setInfo(List<String> info) {
		this.info = info;
	}

	public Person(String name, String surname, int age, List<String> info) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.info = info;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", age=" + age + ", info=" + info + "]";
	}

}
