package app_java.abstractClass;

public class Q extends P implements X  {

	@Override
	public void test1(int x) {
		System.out.println(x);
	}

	@Override
	public void test2(int x) {
		System.out.println(x);
	}
	public static void main(String[] args) {
		Q y = new Q();
		y.test1(15200);
		y.test2(15800);
		
	}

}
