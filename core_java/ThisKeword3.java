package core_java;

public class ThisKeword3 {
	int x = 10000;
	
	ThisKeword3(){
		System.out.println("Rahul");
	}
	ThisKeword3(int x){
		this();
		System.out.println(x);
		System.out.println(this.x);
	}
	public static void main(String[] args) {
		ThisKeword3 t = new ThisKeword3(100);
	}
	
}
