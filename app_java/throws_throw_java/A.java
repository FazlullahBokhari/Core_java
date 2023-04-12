package app_java.throws_throw_java;

import java.io.FileWriter;

public class A {
	public static void main(String[] args) {
		try {
			A a = new A();
			a.test(); // handled exception
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void test() throws Exception {
		FileWriter fw = new FileWriter("C://test.txt");
	}
}
