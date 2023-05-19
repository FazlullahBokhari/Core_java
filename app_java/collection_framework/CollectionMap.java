package app_java.collection_framework;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();
		
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		
		System.out.println(numbers);
		
		numbers.put("Two", 22);
		
		System.out.println(numbers);
		
		if(!numbers.containsKey("Two")) {
			numbers.put("Two", 44);
		}
		
		System.out.println(numbers);
		
		numbers.putIfAbsent("Two", 55);
		
		System.out.println(numbers);
		
		for(Map.Entry<String, Integer> e: numbers.entrySet()) {
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		for(String key: numbers.keySet()) {
			System.out.println(key);
		}
		
		for(int val: numbers.values()) {
			System.out.println(val);
		}
		
		System.out.println(numbers.containsKey("Two"));
		System.out.println(numbers.containsValue(22));
		System.out.println(numbers.isEmpty());
		
		// treemap implements hashmap with orders are sorted
	}

}
