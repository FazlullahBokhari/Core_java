package app_java;

public class O extends N {
	public static void main(String[] args) {
		N n = new O();
		System.out.println(n);
		n = new M();
		System.out.println(n);
		O o = (O)new N();
		System.out.println(o);
		M m = (M)new N();
		System.out.println(m);
		
	}
}
