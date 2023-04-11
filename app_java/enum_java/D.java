package app_java.enum_java;

public class D extends Object {
	
	protected void finalize() {
		System.out.println(1000);
	}
	
	public static void main(String[] args) {
		D d = new D();
		d = null; 
		System.gc();
	}
}
