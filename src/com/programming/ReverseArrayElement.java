package com.programming;

public class ReverseArrayElement {

	public static void main(String[] args) {
		int[] ar = {12,43,32,54,45,6,17};
		int n = ar.length;
		int temp = 0;
		for (int i = 0; i <= n/2; i++) {
			temp = ar[i];
			ar[i] = ar[n-1-i];
			ar[n-1-i] = temp;
		}
		
		for (int i : ar) {
			System.out.println(i);
		}
	}
}
