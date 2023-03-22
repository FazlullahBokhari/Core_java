package oops.access_specifier.p1;

public class G {
	protected int x = 10;
	protected void test() {
		System.out.println("From test method G class package p1");
	}
	public static void main(String[] args) {
		G g1 = new G();
		System.out.println(g1.x);
		g1.test();
	}

}
