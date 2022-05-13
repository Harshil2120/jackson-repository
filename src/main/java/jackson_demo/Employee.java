package jackson_demo;

public class Employee {

	private String name;
	private String city;
	private int age;
	private String designation;
	

	public Employee() {
		super();
	}
	public Employee(String name, String city, int age, String designation) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	public String getDesignation() {
		return designation;
	}
	
}
