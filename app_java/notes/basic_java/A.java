package app_java.notes.basic_java;

public class A {
	int x = 10;
	static int y = 20;
	int z = 100;
	static int s = 5360;
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1);
		A a2 = new A();
		System.out.println(a2);
		System.out.println("Non static varivale value: "+a2.x);
		System.out.println("Static variable value: "+A.y);
		a2.z = 500;
		System.out.println(a2.z);
		System.out.println(a1.z);//non static main value will not change only xerox copy will change
		System.out.println(A.s);
		A.s = 8520;
		System.out.println(A.s);
	}

}
