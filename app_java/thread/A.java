package app_java.thread;

public class A extends Thread {// run() start()
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Run");
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.start();
		for(int i=0; i<10; i++) {
			System.out.println("Main");
		}
		
	}
}
