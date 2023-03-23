package app_java;

public class D implements Z {

	@Override
	public void test1() {
		System.out.println("Test 1 method");
		
	}

	@Override
	public void tes2() {
		System.out.println("Test 2 method");
	}

	@Override
	public void test3() {
		System.out.println("Test 3 method");
	}
	public static void main(String[] args) {
		D d = new D();
		d.test1();
		d.tes2();
		d.test3();
	}
}
