package app_java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,35,2,1,16);
		
		List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		List<String> names = Arrays.asList("mike","mithin","mithun","Faiz","stallin","fazlu","Faiz");
		
		List<String> namesList = names.stream().filter(name->name.startsWith("m")).collect(Collectors.toList());
		System.out.println(namesList);
		
		List<String> name_faiz = names.stream().filter(name->name.equalsIgnoreCase("faiz")).collect(Collectors.toList());
		System.out.println(name_faiz);
		
		List<String> namesUpper = names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(namesUpper);
		
		List<String> namesUpperNoDuplicate = names.stream().distinct().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(namesUpperNoDuplicate);
		
		
		
		
	}

}
