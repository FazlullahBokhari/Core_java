package oops.access_specifier.p1;

public class L {
	public static void main(String[] args) {
		System.out.println("From class L package p1");
		J j = new J();
		System.out.println(j.x);
		j.test();
	}

}
