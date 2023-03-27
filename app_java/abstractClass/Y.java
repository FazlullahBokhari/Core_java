package app_java.abstractClass;

public class Y extends Z {

	@Override
	public void test1() {
		System.out.println(100);
	}

	@Override
	public void test2() {
		System.out.println(200);
	}
	public static void main(String[] args) {
		Y y = new Y();
		y.test1();
		y.test2();
	}

}
