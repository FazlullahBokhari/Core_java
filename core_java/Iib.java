package core_java;

public class Iib {
	int i;
	{
		i = 100;
		System.out.println(i);
		System.out.println("From IIB");
	}

	Iib() {
		System.out.println("From Constructor");
	}

	static {
		System.out.println("From static block");
	}

	public static void main(String[] args) {
		Iib i = new Iib();
		System.out.println("From main");
	}

}
