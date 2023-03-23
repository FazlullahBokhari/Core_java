package app_java;

public class A implements I {
	static int x = 200;
	@Override
	public void test() {
		System.out.println("Test complete method");
	}
	@Override
	public int test1(int x) {
		return x;
	}
	public static void test2() {
		System.out.println("Static member of class A");
	}
	public static void main(String[] args) {
		A a = new A();
		a.test();
		int val = a.test1(15000);
		System.out.println(val);
		System.out.println(A.x);
	}
}
