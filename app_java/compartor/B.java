package app_java.compartor;

import java.util.Comparator;

public class B implements Comparator<Student> {

	public static void main(String[] args) {
		B b = new B();
		int val = b.compare(new Student(100, "abc"), new Student(200,"xyz"));
		System.out.println(val);
		
	}

	@Override
	public int compare(Student o1, Student o2) {

		return o1.name.compareTo(o2.name);
	}

}
