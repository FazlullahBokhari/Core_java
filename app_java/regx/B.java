package app_java.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s");// for white space
		Pattern p1 = Pattern.compile("\\S"); // for other than white space
		Matcher m = p.matcher("a6 b# z 9 D");
		Matcher m1 = p1.matcher("a6 b# z 9 D");
		while(m.find()) {
			System.out.println(m.start()+"---"+m.group());
		}
		System.out.println("One Loop Completed");
		while(m1.find()) {
			System.out.println(m1.start()+"---"+m1.group());
		}
		System.out.println("For Digits");
		Pattern p2 = Pattern.compile("\\d"); // for digits
		Matcher m2 = p2.matcher("a6 b# z 9 D");
		while(m2.find()) {
			System.out.println(m2.start()+"---"+m2.group());
		}
		
		System.out.println("For other than Digits");
		Pattern p3 = Pattern.compile("\\D"); // for other than digits
		Matcher m3 = p3.matcher("a6 b# z 9 D");
		while(m3.find()) {
			System.out.println(m3.start()+"---"+m3.group());
		}
		
		System.out.println("For other than special character");
		Pattern p4 = Pattern.compile("\\w"); // for other than special character
		Matcher m4 = p4.matcher("a6 b# z 9 D");
		while(m4.find()) {
			System.out.println(m4.start()+"---"+m4.group());
		}
		
		System.out.println("For only special character");
		Pattern p5 = Pattern.compile("\\W"); // for only special character
		Matcher m5 = p5.matcher("a6 b# z 9 D");
		while(m5.find()) {
			System.out.println(m5.start()+"---"+m5.group());
		}
	}
}
