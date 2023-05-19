package app_java.collection_framework;

import java.util.ArrayDeque;

public class CollectionDeque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(23);
		adq.offerFirst(50);
		adq.offerLast(100);
		
		System.out.println(adq);
		adq.offer(80);
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.poll());
		System.out.println(adq.pollFirst());
		System.out.println(adq.pollLast());
		
		System.out.println(adq);
		
		
	}

}
