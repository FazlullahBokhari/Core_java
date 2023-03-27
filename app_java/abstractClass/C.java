package app_java.abstractClass;

abstract public class C {
	int x = 5200;
	static int y = 1000;
	public void test1() {
		System.out.println(1);
	}
	abstract public void test2();
	public static void main(String[] args) {
		System.out.println(C.y);
	}
}
