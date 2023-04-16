package app_java.collection;

import java.util.*;

public class B {
	public static void main(String[] args) {
			
		List<Integer> z = new LinkedList<Integer>();
		z.add(1000);
		z.add(20);
		z.add(30);
		z.add(40);
		z.add(50);
		System.out.println(z);
		System.out.println("Ayyar size: "+z.size());
		
		if(z.contains(1000)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		z.remove(1);
		System.out.println(z);
		System.out.println(z.get(2));
		
		Iterator itr = z.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Value of z "+itr.next());
		}
		
		LinkedList<Integer> x = new LinkedList<Integer>();
		x.addFirst(100);
		x.addFirst(200);
		x.addFirst(300);
		x.addFirst(400);
		System.out.println(x);
		x.add(500);
		System.out.println(x);
		x.addLast(600);
		x.addLast(700);
		System.out.println(x);
	}
}
