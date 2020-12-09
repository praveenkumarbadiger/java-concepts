package com.programming;

public class CountRotationsInSortedArray {

	public static void main(String[] args) {
		int arr[] = {15, 18, 2, 3, 6, 12}; 
		
		int min = arr[0];
		int min_index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
				min_index = i;
			}
		}
		
		if(min_index > 0) {
			System.out.println("Rotation count is = "+min_index);
		}
	}

}
