package oops.access_specifier.p2;
import oops.access_specifier.p1.D;

public class G extends D{
	public static void main(String[] args) {
		G g1 = new G();
		System.out.println(g1.x);
		g1.test();
	}
}
