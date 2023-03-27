package app_java.abstractClass;

public class B extends C {
	@Override
	public void test2() {
		System.out.println(2);
	}
	public static void main(String[] args) {
		B b = new B();
		b.test1();
		b.test2();
		System.out.println(b.x);
		System.out.println(B.y);
	}
}
