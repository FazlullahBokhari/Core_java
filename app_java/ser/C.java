package app_java.ser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class C {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream oos = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\test1.ser");
			oos = new ObjectInputStream(fis);
			A a = (A)oos.readObject();
			System.out.println(a.city);
			System.out.println(a.name);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Done");
		}
	}
	
}
