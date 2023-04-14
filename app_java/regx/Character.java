package app_java.regx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Character {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*");
		Matcher m = p.matcher("aaabaabaabaab");
		
		while(m.find()) {
			System.out.println(m.start()+ "....."+m.group());
		}
	}
}
