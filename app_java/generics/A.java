package app_java.generics;

public class A<T> {
	
	T val;
	
	A(T x){
		this.val = x;
		System.out.println(val);
	}

}
