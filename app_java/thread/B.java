package app_java.thread;

public class B extends Thread {
	String name;
	
	B(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(this.name);
		}
	}
	
	public static void main(String[] args) {
		B b = new B("Faiz");
		B b1 = new B("Fazlu");
		B b2 = new B("Fazlullah");
		B b3 = new B("Bokhari");
		b.start();
		b1.start();
		b2.start();
		b3.start();
	}
}
