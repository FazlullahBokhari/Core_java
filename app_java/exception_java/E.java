package app_java.exception_java;

public class E {

	public static void main(String[] args) {
		try {
			int a = 100/0;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			System.out.println("Finally block");
		}
	}

}
