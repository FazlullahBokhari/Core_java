package core_java;

public class H {
	public static void main(String[] args) {
		H h = new H();
		h.test();
		h.test1(100, 200, 300, 400, 500);
	}

	public void test() {
		System.out.println(100);
		return;
	}

	public void test1(int... x) {
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
	}

}
