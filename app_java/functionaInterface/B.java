package app_java.functionaInterface;

public class B {
	public static void main(String[] args) {
		Ii i = (int x)->{
			return x;
		};
		int values = i.test(500);
		System.out.println(values);
	}
}
