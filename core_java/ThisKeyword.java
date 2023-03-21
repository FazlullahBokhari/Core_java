package core_java;

public class ThisKeyword {
	int x = 10;
	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		ThisKeyword t = new ThisKeyword();
		System.out.println("Address of the class inside reference variable: "+t);
		System.out.println(t.x);
		t.test();
	}
	public void test() {
		System.out.println("Inside Test Method");
		System.out.println("Address of class inside test method (this keyword) method: "+this);
		System.out.println(this.x);
		this.test1();
	}
	public void test1() {
		System.out.println("Inside Test1 Method");
		System.out.println("Hello");
	}

}
