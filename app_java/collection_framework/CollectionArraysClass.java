package app_java.collection_framework;

import java.util.Arrays;

public class CollectionArraysClass {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		int index = Arrays.binarySearch(numbers, 4);
		
		System.out.println("index of element 4 in the array is: "+index);
		
		Integer[] nums = {10,2,3,50,25,15,16};
		Arrays.sort(nums);
		
		for(int i: nums) {
			System.out.println(i);
		}
	}

}


