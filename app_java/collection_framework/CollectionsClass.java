package app_java.collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class CollectionsClass {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(34);
		list.add(12);
		list.add(9);
		list.add(76);
		list.add(29);
		list.add(17);
		list.add(13);
		list.add(8);
		System.out.println(list);
		
		System.out.println("Min element :"+Collections.min(list));
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		
		List<Student> list1 = new ArrayList<>();
		
		list1.add(new Student("Faiz",2));
		list1.add(new Student("Fazlu",3));
		list1.add(new Student("Faiz",2));
		list1.add(new Student("Fazlullh",5));
		list1.add(new Student("Bokhari",1));
		list1.add(new Student("nemat",1));
		
		System.out.println(list1);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		Collections.sort(list1, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		
		Collections.sort(list1, (o1, o2)->o1.name.compareTo(o2.name));
		
		System.out.println(list1);
		
	}

}
