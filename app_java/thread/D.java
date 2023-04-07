package app_java.thread;

public class D implements Runnable {
	String name;
	D(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(this.name);
		}
	}
	public static void main(String[] args) {
		D d = new D("Faiz");
		Thread t = new Thread(d);
		t.start();
		D d1 = new D("Fazlu");
		Thread t1 = new Thread(d1);
		t1.start();
		D d2 = new D("Fazlullah");
		Thread t2 = new Thread(d2);
		t2.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main");
		}
	}

}
