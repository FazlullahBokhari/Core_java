package app_java.tokenizer;

import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) {
		int count = 0;
		StringTokenizer str = new StringTokenizer("Pankaj sir academy bangalore");
		
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			count++;
		}
		System.out.println(count);
		
		int count1 = 0;
		StringTokenizer str1 = new StringTokenizer("12-12-2020", "-");
		
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
			count1++;
		}
		System.out.println(count1);
	}

}
