package app_java.throws_throw_java;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class E {
	public static void main(String[] args) throws IOException, SQLException {
		
		FileWriter fw = new FileWriter("C://test.txt");
		DriverManager.getConnection("", "", "");
	}
}
