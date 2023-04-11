package app_java.thread;

public class G {
	public static void main(String[] args) {
		F f = new F();
		f.start();
		synchronized (f) {
			try {
				f.wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(f.total);
	}
}
