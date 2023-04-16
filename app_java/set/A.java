package app_java.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class A {

	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<>();
		
		hashset.add(20);
		hashset.add(30);
		hashset.add(40);
		hashset.add(50);
		hashset.add(null);
		
		System.out.println(hashset);
		
		
		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
		
		linkedhashset.add(20);
		linkedhashset.add(30);
		linkedhashset.add(40);
		linkedhashset.add(50);
		linkedhashset.add(null);
		
		System.out.println(linkedhashset);
	}

}
