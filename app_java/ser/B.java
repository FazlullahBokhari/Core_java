package app_java.ser;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;


public class B {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		A a = new A();
		try {
			fos = new FileOutputStream("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\test1.ser"); 
			oos = new ObjectOutputStream(fos); 
			oos.writeObject(a);;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			oos.close();
			fos.close();
			}catch(Exception a1) {
				a1.printStackTrace();
			}
		}
			
		}
}
