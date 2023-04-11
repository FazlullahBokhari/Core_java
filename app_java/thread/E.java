package app_java.thread;

public class E {
	int balance = 0;
	
	public static void main(String[] args) {
		E e = new E();
		e.account();
		System.out.println(e.balance);
		
	}
	
	public void account() {
		Thread t = new Thread(new Runnable(){
			@Override
			public void run() {
				add();
			}
		});
		
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				sub();
			}
		});
		t.start();
		t1.start();
		try {
			t.join();
			t1.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public synchronized void add() {
		for(int i=0; i<10; i++) {
			balance = balance + i;
			//System.out.println(balance);
		}
	}
	public synchronized void sub() {
		for(int i=0; i<8; i++) {
			balance = balance - i;
		}
		
	}

}
