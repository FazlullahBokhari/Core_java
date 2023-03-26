package app_java.functionaInterface;

public class A implements I{
	@Override
	public void test1() {
		System.out.println("Functional Interface");
	}
	public static void main(String[] args) {
		A a = new A();
		a.test1();
		a.test2();
		int val = a.test3(500);
		System.out.println(val);
	}
}
