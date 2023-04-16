package app_java.fileHandling;

import java.io.File;

public class A {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\test1.txt");
		
		System.out.println(f);
		// checking the file is present at given path
		boolean val = f.exists();
		System.out.println(val);
		// deleting the file at the from the above path
		boolean del = f.delete();
		System.out.println(del);
		
		try {
			File f1 = new File("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\test1.txt");
			//creating a file at the above path
			boolean file_created = f1.createNewFile();
			System.out.println(file_created);
			// counting the number of characters in the file
			long content = f1.length();
			System.out.println(content);
			//crating the folder at the given path
			File fol = new File("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example\\p1");
			boolean folder = fol.mkdir();
			System.out.println(folder);
			
			File f2 = new File("C:\\Users\\fazlu\\eclipse-workspace\\app_java\\src\\core_java\\file_example");
			String[] names = f2.list();
			for(String s: names) {
				System.out.println(s);
			}
			System.out.println(names.length);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
