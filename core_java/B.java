package core_java;

public class B {
	public static void main(String[] args) {
		B b = new B();
		b.test();
		B.test1();
	}
	public void test() {
		System.out.println(1200);
	}
	public static void test1() {
		System.out.println(1400);
	}
}
