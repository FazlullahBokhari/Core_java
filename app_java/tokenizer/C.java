package app_java.tokenizer;

public class C implements Cloneable{
	
	public static void main(String[] args) {
		C c = new C();
		
			try {
				C c1 = (C)c.clone();
				System.out.println(c);
				System.out.println(c1);
				System.out.println(c.hashCode());
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			
	}
}
