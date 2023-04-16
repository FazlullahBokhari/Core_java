package app_java.fileHandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;


public class D {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\test3.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			char[] ch = new char[(int)f.length()];
			br.read(ch);
			for(char c: ch) {
				System.out.println(c);
			}
			n
			File f1 = new File("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\test3.txt");
			FileReader fr1 = new FileReader(f1);
			BufferedReader br1 = new BufferedReader(fr1);
			System.out.println(br1.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
