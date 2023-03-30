package app_java.exception_java;

public class D {
	public static void main(String[] args) {
		String s = "100";
		int val = Integer.parseInt(s);
		System.out.println(val);
		String str1 = "10.3";
		float f = Float.parseFloat(str1);
		System.out.println(f);
		try {
			String str = "test";
			int val_str = Integer.parseInt(str);
			System.out.println(val_str);
		} catch (NumberFormatException n) {
			n.printStackTrace();
		}
		System.out.println("Welcome");
		
	}
}
