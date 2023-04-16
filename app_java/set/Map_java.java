package app_java.set;

import java.util.HashMap;
import java.util.Map;

public class Map_java {

	public static void main(String[] args) {
		Map<Integer, String> studentInfo = new HashMap<Integer, String>();
		studentInfo.put(100, "Faiz");
		studentInfo.put(101, "Fazlu");
		studentInfo.put(102, "Fazlullah");
		
		System.out.println(studentInfo);
		
		System.out.println(studentInfo.get(102));
		System.out.println(studentInfo.values());
		System.out.println(studentInfo.keySet());
		
	}

}
