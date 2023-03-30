package app_java.exception_java;

public class C {
	int x = 10;
	public static void main(String[] args) {
		try {
			C c = null;
			System.out.println(c.x);
		} catch (NullPointerException n) {
			n.printStackTrace();
			System.out.println("Welcome");
		}
	}

}
