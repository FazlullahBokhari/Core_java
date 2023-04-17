package app_java.superInJava;

public class B extends A {
	
	B(){
		super();
	}
	public static void main(String[] args) {
		B b = new B();
		b.test();
		b.test1();
	}
	public void test1() {
		System.out.println(super.i);
		super.test();
		System.out.println(super.j);
	}
}
