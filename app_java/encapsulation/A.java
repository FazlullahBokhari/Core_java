package app_java.encapsulation;

public class A {
	
	String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		A a = new A();
		a.setName("Faiz");
		System.out.println(a.getName());
	}

}
