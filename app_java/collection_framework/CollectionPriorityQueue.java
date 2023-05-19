package app_java.collection_framework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CollectionPriorityQueue {

	public static void main(String[] args) {
		
		//MinHeap implementation
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(10);
		pq.add(30);
		pq.add(80);
		pq.add(50);
		pq.add(5);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println("------------------------------------");
		//MaxHeap
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq1.offer(10);
		pq1.add(30);
		pq1.add(80);
		pq1.add(50);
		pq1.add(5);
		
		System.out.println(pq1);
		
		System.out.println(pq1.poll());
		
		System.out.println(pq1);
		
		System.out.println(pq1.peek());
		
		
		
		
		
		
		
	}

}
