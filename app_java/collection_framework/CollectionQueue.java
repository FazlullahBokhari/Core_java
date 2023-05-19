package app_java.collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(12);
		queue.offer(20);
		queue.offer(30);
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println(queue.peek());
	}
}
