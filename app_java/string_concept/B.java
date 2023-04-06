package app_java.string_concept;

public class B {

	public static void main(String[] args) {
		String s1 = new String("xyz");
		String s2 = new String("xyz");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}
