package app_java.throws_throw_java;

import java.io.FileWriter;

public class B {

	public static void main(String[] args) throws Exception {
		B b = new B();
		b.test();
	}

	public void test() throws Exception {
		FileWriter fw = new FileWriter("C://test.txt()");
	}

}
