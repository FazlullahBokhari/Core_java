package oops.overriding;

public class B extends A {
	
	@Override
	public void test() {
		System.out.println(5000);
	}
	public static void main(String[] args) {
		B b = new B();
		b.test();
		b.test1();
	}
	
}
