package app_java.collection;

import java.util.*;

public class A {
	
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);
		x.add(new Integer(40));
		x.add("Faiz");
		x.add(true);
		
		System.out.println(x);
		
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(50);
		y.add(100);
		y.add(200);
		y.add(2, 500);
		System.out.println(y);
		
		ArrayList<Integer> z = new ArrayList<Integer>();
		z.add(1000);
		z.addAll(0, y);
		System.out.println(z);
		
		if(z.contains(1000)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		z.remove(1);
		System.out.println(z);
	}
}
