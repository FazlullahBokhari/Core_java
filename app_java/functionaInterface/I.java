package app_java.functionaInterface;

@FunctionalInterface
public interface I {
	public void test1();
	default public void test2() {
		System.out.println("default keword is used to create a complete method in an interface");
	}
	default int test3(int x) {
		return x;
	}
}
