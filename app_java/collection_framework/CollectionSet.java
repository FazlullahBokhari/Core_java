package app_java.collection_framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(32);
		set.add(2);
		set.add(54);
		set.add(21);
		set.add(65);
		
		System.out.println(set);
		
		set.remove(54);
		
		System.out.println(set); 
		
		System.err.println(set.contains(65));
		
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		set.clear();
		System.out.println(set);
		
		
		System.out.println("______________________");
		
		Set<Integer> set1 = new LinkedHashSet<>();
		
		set1.add(32);
		set1.add(2);
		set1.add(54);
		set1.add(21);
		set1.add(65);
		
		System.out.println(set1);
		
		set1.remove(54);
		
		System.out.println(set1); 
		
		System.err.println(set1.contains(65));
		
		System.out.println(set1.isEmpty());
		
		System.out.println(set1.size());
		
		set1.clear();
		System.out.println(set1);
		
		System.out.println("_______________________________");
		
		//Binary search tree
		Set<Integer> set2 = new TreeSet<>();
		
		set2.add(32);
		set2.add(2);
		set2.add(54);
		set2.add(21);
		set2.add(65);
		
		System.out.println(set2);
		
		set2.remove(54);
		
		System.out.println(set2); 
		
		System.err.println(set2.contains(65));
		
		System.out.println(set2.isEmpty());
		
		System.out.println(set2.size());
		
		set2.clear();
		System.out.println(set2);
		
		
	}
}
