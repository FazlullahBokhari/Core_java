package app_java.thread;

public class H extends Thread {
	public static void main(String[] args) {
		H h = new H();
		System.out.println(h.getState());
		h.start();
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(h.getState());
	}
	public void run() {
		System.out.println("Test");
	}
}
