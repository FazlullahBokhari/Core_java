package app_java.fileHandling;

public class F {
	public static void main(String[] args) {
		try {
			int x = 10/2;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println(100);
		}
		System.out.println("Outside of try catch finally block ");
	}

}
