package oops.access_specifier.p1;

public class K extends J {
	public static void main(String[] args) {
		System.out.println("From class K package p1");
		K k = new K();
		System.out.println(k.x);
		k.test();
	}
}
