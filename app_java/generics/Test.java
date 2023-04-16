package app_java.generics;

public class Test {

	public static void main(String[] args) {
		A<String> a = new A<String>("Faiz");
		
		A<Integer> a1 = new A<Integer>(100);
		
		A<Boolean> a2 = new A<Boolean>(true);
		
		A<Character> a3 = new A<Character>('b');
	}

}
