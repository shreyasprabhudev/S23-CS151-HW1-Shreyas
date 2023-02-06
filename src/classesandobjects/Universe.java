package classesandobjects;

import java.util.List;

public class Universe {
	
	// association - two ways aggregation and composition
	List<Person> people;
	List<Animal> animals;

	public static void main(String[] args) {
		Person griffin = new Person("Griffin", 100);
		Person abhishek = new Person("Abhishek", 100);

		System.out.println(griffin.toString());
		System.out.println(abhishek.toString());

	}
	
}
