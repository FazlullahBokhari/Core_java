package oops.access_specifier.p1;

public class A {
	private int x = 10;
	private void test() {
		System.out.println("From Test Method Package p1");
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
	}

}
