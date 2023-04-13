package app_java.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("a6 b# z 9 D");
		while(m.find()) {
			System.out.println(m.start()+"---"+m.group());
		}
	}
}
