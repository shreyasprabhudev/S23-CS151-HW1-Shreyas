package classesandobjects;

public class Person {
	public String name;
	public int age;
	private int heighInCms;
	int weight;
	
	// int is primitive
	
	// constructors
	// same name and no return type
	public Person() {
		this.name = "Abhishek";
		this.age = 25;
		this.weight = 1000;
		this.heighInCms = 1000;
	}
	
	public Person(String name, int age) {
		// constructor chaining
		this();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {

	}

	public void walk() {

	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", heighInCms=" + heighInCms + ", weight=" + weight + "]";
	}
	
	

}
