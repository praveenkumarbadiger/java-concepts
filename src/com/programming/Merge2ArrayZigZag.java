package com.programming;

public class Merge2ArrayZigZag {

	public static void main(String[] args) {
		int[] ar1 = {1,3,5,7,9};
		int[] ar2 = {2,4,6};

		int[] result =  new int[ar1.length + ar2.length];
		int i,k ;
		
		for(i=0, k=0; i < ar1.length && i < ar2.length; i++) {
			result[k] = ar1[i];
			k++;
			result[k] = ar2[i];
			k++;
		}
		
		for (; i < ar1.length; i++,k++) {
			result[k] = ar1[i];
		}
		
		for (; i < ar2.length; i++,k++) {
			result[k] = ar2[i];
		}
		
		for (int j : result) {
			System.out.print(j);
		}
	}

}
