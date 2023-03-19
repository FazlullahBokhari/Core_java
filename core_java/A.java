package core_java;

public class A {
	int x = 10;
	static int y = 20;
	public static void main(String[] args) {
		System.out.println("first class");
		A a = new A();
		System.out.println(a);
		A a1 = new A();
		System.out.println(a1);
		
		A a2 = new A();
		System.out.println(a2);
		
		System.out.println(a2.x);
		System.out.println(a.x);
		System.out.println(a1.x);
		System.out.println(y);
		System.out.println(A.y);
	}
}
