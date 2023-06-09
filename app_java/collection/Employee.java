package app_java.collection;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int id;
	
	Employee(String firstName, String lastName, int id){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setId(id);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
