package app_java.regx;


import java.util.regex.*;


public class A {
	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a6b#z9D");
		while(m.find()) {
			System.out.println(m.start()+"---"+m.group());
		}
	}
}
