package app_java.fileHandling;

import java.io.FileWriter;
import java.io.BufferedWriter;

public class E {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\test5.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(100);
			bw.newLine();
			bw.write("mike");
			bw.newLine();
			char[] ch = {'a','b'};
			bw.write(ch);
			
			bw.close();
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
