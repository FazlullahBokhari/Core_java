package oops.access_specifier.p1;

public class J {
	public int x = 1000;
	public void test() {
		System.out.println("From Package p1 class J method test");
	}
	public static void main(String[] args) {
		J j = new J();
		System.out.println(j.x);
		j.test();
	}
}
