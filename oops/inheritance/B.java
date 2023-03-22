package oops.inheritance;

public class B extends A {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.x);
		b.test();
	}
	public void test1() {
		System.out.println("Test2 method");
	}
	
}
