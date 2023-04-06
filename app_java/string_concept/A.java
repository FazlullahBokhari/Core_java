package app_java.string_concept;

final public class A {
	private final int age;
	private final String name;
	
	public A(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String gatName() {
		return name;
	}
	public static void main(String[] args) {
		A a = new A(20,"Faiz");
		int age = a.getAge();
		String name = a.gatName();
		System.out.println("My name is: "+name+" and age is: "+age);
		
		
	}
}
