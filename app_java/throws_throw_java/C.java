package app_java.throws_throw_java;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		int balance = 500;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the amount: ");
		int amount = s.nextInt();
		
		if(balance>amount) {
			System.out.println("Please collect the cash");
		}else {
			try {
				throw new InSufficientFunds();
			}catch (InSufficientFunds e) {
				System.out.println(e+"ggggggggggggggg");
				System.out.println("Low balance");
				e.printStackTrace();
			}
		}
		s.close();
		
		
	}

}
