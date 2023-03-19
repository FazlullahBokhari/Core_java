package core_java;

public class D {
	int x = 10;
	public static void main(String[] args) {
		D d = new D(); // copy of x is loaded
		D d1 = new D(); // copy of x is loaded 
		d1.x = 400; 
		System.out.println(d.x); // 10
		System.out.println(d1.x);  //400
		
		D d2 = null;
		System.out.println(d2);
		D d3 = new D();
		System.out.println(d3);
	}
	
}
