package app_java.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("xyz", "abc", "def", "zmn");
		
		List<String> newNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(newNames);
		
	}

}
