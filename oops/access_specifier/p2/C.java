package oops.access_specifier.p2;
import oops.access_specifier.p1.A;

public class C extends A {
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.x);
		c1.test();
	}
}
