package app_java.regx;

import java.util.Scanner;

public class MobileNumber {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your mobile number: ");
		String str = input.next();
		String regex = "[6-9][0-9]{9}";
		
		if(str.matches(regex)) {
			System.out.println("Valid mobile number");
		}else {
			System.out.println("Invalid Mobile number");
		}
		input.close();
	}

}
