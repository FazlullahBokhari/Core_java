package app_java.exception_java;

public class B {
	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x/y;
			System.out.println(z);
		} catch (ArithmeticException a) {
			a.printStackTrace();
		}
		System.out.println("Wecome");
	}
}
