package app_java.thread;

public class F extends Thread{
	int total = 0;
	
	public synchronized void run() {
		for(int i=0; i<10; i++) {
			total = total + i;
		}
		notify();
	}
}
