package oops.inheritance;

public class C extends B {
		public void test3() {
			System.out.println("Test 3 method");
	}
	public static void main(String[] args) {
		C c = new C();
		c.test();
		c.test1();
		c.test3();
	}
}
