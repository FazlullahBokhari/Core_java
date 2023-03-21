package core_java;

public class C {
	static int x = 10;

	public static void main(String[] args) {
		System.out.println(C.x);
		C c = new C();
		c.test();
	}

	public void test() {
		System.out.println(C.x);
	}

}
