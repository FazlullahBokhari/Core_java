package oops.access_specifier.p2;
import oops.access_specifier.p1.G;

public class I extends G {
	public static void main(String[] args) {
		System.out.println("From Package P2");
		I g1 = new I();
		System.out.println(g1.x);
		g1.test();
	}

}
