package app_java.array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {38,23,32,14,7};
		
		for(int j=0; j<arr.length-1; j++) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i+1]; // y
					arr[i+1] = arr[i]; // x
					arr[i] = temp; 
				}
			}
		}
		for(int val: arr) {
			System.out.println(val);
		}
	}

}
