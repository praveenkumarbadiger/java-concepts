package com.programming;

public class BiggestNumbersInArray {

	public static void main(String[] args) {
		//swap1stPartArrayWith2ndPart();
		
		
		int[] a = {12,13,15};
		// a = insertEleInArray(a, 14,2);
		
		// delete 
		a = deleteEleInArray(a,2);
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	public static void biggestTwoNumbers() {
		int ar[] = {12,34,65,23,46,98,67,35};
		int fbig = ar[0];
		int sbig = ar[1];
		for (int i = 1; i < ar.length; i++) {
			if(ar[i] > fbig) {
				sbig = fbig;
				fbig=ar[i];
			}else if(ar[i] > sbig) {
				sbig = ar[i];
			}
		}
		System.out.println("First number : "+fbig + "  and second number: "+sbig);
	}
	
	public static void biggestTwoNumbersOfItsPosition() {
		int ar[] = {12,34,65,23,46,98,67,35};
		int fbig = 0;
		int sbig = 0;
		for (int i = 1; i < ar.length; i++) {
			if(ar[i] > ar[fbig]) {
				sbig = fbig;
				fbig=i;
			}else if(ar[i] > ar[sbig]) {
				sbig = i;
			}
		}
		
		System.out.println("First number Position :  "+fbig + "  and second number Position: "+sbig);
	}
	
	public static void smallestTwoNumbers() {
		int ar[] = {12,34,65,23,46,98,67,35};
		int fsmall = ar[0];
		int ssmall = ar[1];
		for (int i = 1; i < ar.length; i++) {
			if(ar[i] < fsmall) {
				ssmall = fsmall;
				fsmall=ar[i];
			}else if(ar[i] < ssmall) {
				ssmall = ar[i];
			}
		}
		
		System.out.println("First number : "+fsmall + "  and second number: "+ssmall);
	}
	
	// swap 1st part array with second part of array
	public static void swap1stPartArrayWith2ndPart() {
		int ar[] = {12,34,65,23,46,98,67,35};
		int n = ar.length;
		int temp =0;
		for (int i = 0; i < n /2; i++) {
			temp = ar[i];
			ar[i]= ar[n-n/2 +i];
			ar[n-n/2 +i] =temp; 
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(" "+ar[i]);
			
		}
	}
	
	public static int[] insertEleInArray(int[] a, int ele, int index ) {
		if(index < 0 || index >= a.length) {
			System.out.println("array index out of bound exception!!!!!");
			return a;
		}
		int[] ta = new int[a.length+1];
		for (int i = 0; i < index; i++) {
			ta[i] = a[i];
		}
		ta[index] = ele;
		for (int i = index; i < a.length; i++) {
			ta[i+1] = a[i];
		}
		return ta;
	}
	
	public static int[] deleteEleInArray(int[] a, int index ) {
		if(index < 0 || index >= a.length) {
			System.out.println("array index out of bound exception!!!!!");
			return a;
		}
		int[] ta = new int[a.length-1];
		for (int i = 0; i < index; i++) {
			ta[i] = a[i];
		}
		for (int i = index+1; i < a.length; i++) {
			ta[i-1] = a[i];
		}
		return ta;
	}
}