package app_java.set;

import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;

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
		
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(100, "Faiz");
		hashtable.put(100, "Faiz");
		hashtable.put(101, "Fazlu");
		hashtable.put(102, "Fazlullah");
		
		System.out.println(hashtable);
		
	}

}
