package app_java.notes.basic_java;

public class Method {
	public static int test_int_method(int x) {
		return x;
	}
	public float test_float_method(float x) {
		return x;
	}
	public static void main(String[] args) {
		int int_val = Method.test_int_method(1000);
		System.out.println(int_val);
		Method m = new Method();
		float float_val = m.test_float_method(520.25f);
		System.out.println(float_val);
	}
}
