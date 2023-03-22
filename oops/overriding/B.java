package oops.overriding;

public class B extends A {
	
	@Override
	public void test(int z) {
		System.out.println(z);
	}
	
	@Override
	public int test2(int y) {
		return y;
	}
	@Override
	public float test3(float f1) {
		return f1;
	}
	public static void main(String[] args) {
		B b = new B();
		b.test(789100);
		b.test1();
		int f = b.test2(8000);
		System.out.println(f);
		float x = b.test3(800.025f);
		System.out.println(x);
		
	}
	
}
