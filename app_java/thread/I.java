package app_java.thread;

public class I extends Thread {
	String name;
	I(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		I i = new I("MaxPriority Thread");
		I i1 = new I("Min Priority Thread");
		I i2 = new I("Thread with priority = 10");
		I i3 = new I("Thread with priority = 3");
		
		i.setPriority(MAX_PRIORITY);
		i1.setPriority(MIN_PRIORITY);
		i2.setPriority(10);
		i3.setPriority(3);
		
		System.out.println(i.getPriority());
		System.out.println(i1.getPriority());
		System.out.println(i2.getPriority());
		System.out.println(i3.getPriority());
		
		i.start();
		i1.start();
		i2.start();
		i3.start();
	}
	public void run() {
		System.out.println(this.name);
	}
}
