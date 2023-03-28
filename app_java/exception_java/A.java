package app_java.exception_java;

public class A {
	public static void main(String[] args) {
		try {
			int x = 20;
			int y = 0;
			int z = x/y;
			System.out.println(z);
			System.out.println("Result");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
}
