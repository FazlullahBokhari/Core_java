package core_java;

public class ThisKeyword {
	int x = 10;
	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		ThisKeyword t = new ThisKeyword();
		System.out.println(t);
		System.out.println(t.x);
		t.test();
	}
	public void test() {
		System.out.println("Inside Test method");
		System.out.println(this);
		System.out.println(this.x);
	}

}
