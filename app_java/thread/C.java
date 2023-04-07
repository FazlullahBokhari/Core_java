package app_java.thread;

public class C implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Run");
		}
	}
	public static void main(String[] args) {
		C c = new C();
		Thread t = new Thread(c);
		t.start();
		C c1 = new C();
		Thread t1 = new Thread(c1);
		t1.start();
		C c2 = new C();
		Thread t2 = new Thread(c2);
		t2.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main");
		}
	}

}
