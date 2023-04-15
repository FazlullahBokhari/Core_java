package app_java.jdbc;

import java.sql.*; 
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		try {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the id");
			int id = input.nextInt();
			System.out.println("Enter the name");
			String name = input.next();
			System.out.println("Enter the city");
			String city = input.next();
			System.out.println("Enter the email");
			String email = input.next();
			System.out.println("Enter the mobile number");
			long mobile = input.nextLong();
			// connection to database
			Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/jdbc", "root", "1234"); 
			
			//using java write SQL Query 
			Statement st = conn.createStatement();
			//st.execute("create table employee(empID int(10), name varchar(40), city varchar(20), email varchar(30), mobile int(10) )");
			
			//st.execute("insert into employee values(007, 'Faiz','Bangalore', 'faiz@yopmail.com',987330086)");
			
			st.execute("insert into employee values('"+id+"', '"+name+"','"+city+"', '"+email+"','"+mobile+"')");
			ResultSet result = st.executeQuery("select * from employee");
			
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
				System.out.println(result.getString(5));
			}
			
			// close database
			conn.close();
			
			input.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
