package app_java.string_concept;

public final class C {
	
	C(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		C c = new C(12);
		C c1 = new C(12);
		System.out.println(c==c1);
		System.out.println(c.equals(c1));
	}
}
