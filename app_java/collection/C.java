package app_java.collection;

import java.util.LinkedList;

public class C {
	
	public static void main(String[] args) {
		Employee faiz = new Employee("Fazlullah", "Bokhari", 7);
		Employee parbhat = new Employee("Parbhat", "Kumar", 8);
		Employee deen = new Employee("Deen", "Dayal", 10);
		
		LinkedList<Employee> empDetails = new LinkedList<Employee>();
		empDetails.add(faiz);
		empDetails.add(deen);
		empDetails.add(parbhat);
		
		System.out.println(empDetails);
		
		for(Employee emp: empDetails) {
			System.out.println(emp.getFirstName());
			System.out.println(emp.getLastName());
			System.out.println(emp.getId());
		}
		
	}
	
	
	
	
}
