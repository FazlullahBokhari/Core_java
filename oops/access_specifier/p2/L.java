package oops.access_specifier.p2;
import oops.access_specifier.p1.J;

public class L {
	public static void main(String[] args) {
		System.out.println("From class L package p2");
		J j = new J();
		System.out.println(j.x);
		j.test();
		
	}
}
