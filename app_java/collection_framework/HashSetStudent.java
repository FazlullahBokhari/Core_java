package app_java.collection_framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetStudent {
	
	public static void main(String[] args) {
		
		Set<Student> studentSet = new HashSet<>();
		
		studentSet.add(new Student("Faiz",2));
		studentSet.add(new Student("Fazlu",3));
		studentSet.add(new Student("Faiz",2));
		studentSet.add(new Student("Fazlullh",5));
		studentSet.add(new Student("Bokhari",1));
		studentSet.add(new Student("nemat",1));
		
		System.out.println(studentSet);
	}

}
