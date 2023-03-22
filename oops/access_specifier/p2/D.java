package oops.access_specifier.p2;
import oops.access_specifier.p1.A;

public class D {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test();
	}
}
