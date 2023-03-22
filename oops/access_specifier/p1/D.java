package oops.access_specifier.p1;

public class D {
	int x = 10;
	void test() {
		System.out.println("From test method D class package p1");
	}
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.x);
		d1.test();
	}
}
