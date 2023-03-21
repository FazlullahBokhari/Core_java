package core_java;

public class ThisKeywork2 {
	ThisKeywork2(){
		this(100);
	}
	ThisKeywork2(int x){
		System.out.println("Inside the constructor with parameter x");
	}
	public static void main(String[] args) {
		ThisKeywork2 t = new ThisKeywork2();
	}
}
