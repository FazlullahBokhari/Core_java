package app_java.fileHandling;

import java.io.FileWriter;

public class C {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			FileWriter fw = new FileWriter("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\test3.txt");
			fw.write("Bokhari");
			fw.write(100);
			
			char ch[] = {'x', 'y', 'z'};
			fw.write(ch);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
