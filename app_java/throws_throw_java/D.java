package app_java.throws_throw_java;

public class D {
	
	public static void main(String[] args) {
		try {
			throw new ApplicationCrash();
		}catch(ApplicationCrash a) {
			System.out.println("Please wait application to be restart");
			System.out.println(a);
			a.printStackTrace();
		}
	}

}
