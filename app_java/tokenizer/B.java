package app_java.tokenizer;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	
	public static void main(String[] args) {
		String str = "Pankaj sir academy";
		StringTokenizer str1 = new StringTokenizer(str, " ");
		while(str1.hasMoreTokens()) {
			String val = str1.nextToken(" ");
			Pattern p = Pattern.compile("[a-zA-Z]");
			Matcher m = p.matcher(val);
			
			while(m.find()) {
				System.out.print(m.group());
			}
			System.out.println();
		}
	}

}
