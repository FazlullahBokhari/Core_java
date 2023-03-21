package core_java;

public class I {
	I() {
		System.out.println(100);
	}

	I(int x) {
		System.out.println(x);
	}

	public static void main(String[] args) {
		I i1 = new I();
		I i2 = new I();
		I i3 = new I(100);
	}
}
