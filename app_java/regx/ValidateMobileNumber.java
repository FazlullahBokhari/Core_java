package app_java.regx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNumber {

	public static void main(String[] args) {
		try {
			System.out.println("Enter your mobile number: ");
			int count = 0;
			Scanner input = new Scanner(System.in);
			Long user_input = input.nextLong();
			String str = user_input.toString();
			Pattern p = Pattern.compile("[6-9][0-9]{9}");
			Matcher m = p.matcher(str);
			while(m.find()) {
				count++;
			}
			if(count==0) {
				System.out.println("Enter a valid mobile number! ");
			}else {
				long mobileNumber = Long.parseLong(str);
				System.out.println("Your Mobile Number is: "+mobileNumber);
			}
			input.close();
		}catch(Exception e) {
			System.out.println("Invalid mobile number");
			e.printStackTrace();
		}
	}
}
