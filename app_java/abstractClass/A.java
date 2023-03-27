package app_java.abstractClass;

abstract public class A {
	static int x = 100;
	int z = 8900;
	abstract public void test();
	public void test2() {
		System.out.println(100);
	}
	public static void main(String[] args) {
		A a = new A();//error
	}

}
