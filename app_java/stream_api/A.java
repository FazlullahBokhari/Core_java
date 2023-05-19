package app_java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class A {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,35,2,1,16);
		
		List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
	}

}
