package app_java.collection_framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {

	public static void main(String[] args) {
		ArrayList<String> studentsName = new ArrayList<>();
		
		studentsName.add("Faiz");
		studentsName.add("Rakesh");
		//size = n==n + (n/2) + 1
		
		System.out.println(studentsName);
		
		List<Integer> list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		list.add(2,100);
		
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("List element: "+list.get(i));
		}
		
		for(Integer element: list) {
			System.out.println("List element in foreach loop: "+element);
		}
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println("list values through iterator " +it.next());
		}
		
	}

}
