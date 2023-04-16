package app_java.fileHandling;

import java.io.FileReader;
import java.io.File;

public class B {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\test1.txt");
			@SuppressWarnings("resource")
			FileReader fr = new FileReader(f);
			
			for(int i=0; i<f.length(); i++) {
				System.out.print((char)fr.read());
			}
			System.out.println();
			
			File f1 = new File("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\test2.txt");
			FileReader fr1 = new FileReader(f1);
			char[] ch = new char[(int)f1.length()];
			fr1.read(ch);
			for(char c: ch) {
				System.out.println(c);
			}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
