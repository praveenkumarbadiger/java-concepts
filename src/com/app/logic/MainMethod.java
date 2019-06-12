package com.app.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMethod {
	public static void main(String[] args) {
		// dublicateElements();
		//sumEvenNumAtEvenPosition();
		//countNoOfAccurChar();
		//palindrome("124321");
		//sumEvenNumAndOddNumbers();
		//firstSecondBiggestOrSmallestNumInArray();
		//mergeTwoArrayInZigZagManner();
		//swapElementsArray();
		//interChange2continuousVowels();
		//interChange2OddNumbers();
		//biggestSumOf2contiNum();
		//deleteElement();
		//missingElementInAnArray();
		missingElementInAnArray1();
	}

	// Searches for duplicate element 
	// NOTE: fails when duplicate elements are more than 2   ******** IMP *********
	public static void dublicateElements() {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3,10,8 };
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.println(arr[j]);
				}
			}
		}
	}
	
	public static void palindrome(String st) {
		char[] chars = st.toCharArray();
		boolean isPalindrome = false;
		for (int i = 0; i < chars.length / 2; i++) {
			if (chars[i] == chars[chars.length - 1 - i]) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}
		}
		System.out.println(isPalindrome);
	}

	// sum of even numbers at even position
	public static void sumEvenNumAtEvenPosition() {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				if (arr[i] % 2 == 0) {
					sum = sum + arr[i];
					System.out.println(arr[i] + " at  " + i);
				}
			}
		}
		System.out.println(sum);
	}
	
	public static void sumEvenNumAndOddNumbers() {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenSum = evenSum + arr[i];
			}else {
				oddSum = oddSum + arr[i];
			}
		}
		System.out.println("Sum of even numbers is an array is =" +evenSum);
		System.out.println("Sum of Odd numbers is an array is =" +oddSum);
	}

	// Count down no of occurrence of each character in string.
	public static void countNoOfAccurChar() {
		String st="PraveenKumaRBadiGer@gmail.com";
		char[] chars=st.toCharArray();
		int[] rs=new int[128];
		for (int i = 0; i < chars.length; i++) {
			rs[chars[i]]++;
		}
		
		for (int i = 0; i < rs.length; i++) {
			// No Of occurrence 
			if(rs[i] > 0) {
				System.out.println("Occurance of  '"+(char)i + "' ----> "+rs[i] );
			}
			/*// Duplicate
			if(rs[i] > 1) {
				System.out.println("Duplicate of  '"+(char)i + "' ----> "+rs[i] );
			}
			// Unique
			if(rs[i] == 1) {
				System.out.println("Unique of  '"+(char)i + "' ----> "+rs[i] );
			}*/
			/*// Missing
			if(rs[i] == 0) {
				System.out.println("Missing of  '"+(char)i + "' ----> "+rs[i] );
			}*/
		}
	}
	
	// find two biggest number in an array // and smallest also
	public static void firstSecondBiggestOrSmallestNumInArray() {
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]>arr[i]) {  // for smallest no change condition : if(arr[j]<arr[i]) {
					int big=arr[j];
					arr[j]=arr[i];
					arr[i]=big;
				}
			}
		}
		for(Integer i : arr) {
			System.out.println(i);
		}
	}
	
	// Merge two array in zig zag manner.
	public static void mergeTwoArrayInZigZagManner() {
		int[] arr1 = new int[] { 1, 3, 5, 7, 8, 9, 10, 11, 12 };
		int[] arr2 = new int[] { 2, 4, 6,};
		int[] rs   = new int[arr1.length+arr2.length];
		
		int i = 0, j = 0, k = 0; 
		// Traverse both array
		while( i<arr1.length && j<arr2.length ) { // upto 2 index this condition will satisfy.
			rs[k++]=arr1[i++];
			rs[k++]=arr2[j++];
		}
		// Store remaining elements of first array
		while( i<arr1.length) { 
			rs[k++]=arr1[i++];
			
		}
		// Store remaining elements of second array 
		while(j<arr2.length ) { 
			rs[k++]=arr2[j++];
		}
		
		for(Integer m  : rs) {
			System.out.println(m);
		}
	}
	
	// swap 1st set of elements with 2nd set of elements in an array.
	public static void swapElementsArray() {
		int[] a = new int[] { 1, 3, 5, 7,0, 8, 9, 10, 11};
		for (int i = 0; i < a.length/2; i++) {
			int t=a[i];
			a[i]=a[(a.length/2)+i];
			a[(a.length/2)+i]=t;
		}
		
		for(Integer i: a) {
			System.out.println(i);
		}
	}

	// interchange continuous 2 vowels
	public static void interChange2continuousVowels() {
		String st ="continUous";
		char[] chars=st.toLowerCase().toCharArray();
		int k=-1;
		
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]=='a'||chars[i]=='e'||chars[i]=='i'||chars[i]=='o'||chars[i]=='u') {
				if(k==-1) {
					k=i;
				}else {
					char t=chars[i];
					chars[i]=chars[k];
					chars[k]=t;
					k=-1;
				}
			}else {
				k=-1;
			}
		}
		String st1=new String(chars);
		System.out.println(st+" after interchange continuous 2 vowels become "+ st1);
	}
	
	// interchange continuous 2 odd number
	public static void interChange2OddNumbers() {
		int[] a=new int[] {12,13,14,16,15,23,46,11,17,24};
		int k=-1;
		Arrays.stream(a).forEach(num -> System.out.println(num));
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2!=0) {
				if(k==-1) {
					k=i;
				}else {
					int t=a[i];
					a[i]=a[k];
					a[k]=t;
					k=-1;
				}
			}else {
				k=-1;
			}
		}
		System.out.println("dsdsd");
		Arrays.stream(a).forEach(num -> System.out.println(num));
	}
	// Biggest sum of 2 continuous number
	public static void biggestSumOf2contiNum() {
		int[] a=new int[] {78,45,12,89,56,23,150};
		int sum=0;
		int k=0;
		for (int i = 0; i < a.length-1; i++) {
			int tempsum=a[i]+a[i+1];
			if(sum<tempsum) {
				sum=tempsum;
				k=i;
			}
		}
		System.out.println("The two biggest numbers in array is " +a[k]+ " and "+a[k+1] + " the sum ="+sum);
	}
	// delete element from array in specified index
	public static void deleteElement() {
		int[] a=new int[] {78,45,12,89,56,23,150};
		int n=5;
		int[] rs=new int[a.length-1];
		if(n < 0 || n > a.length) {
			System.out.println("index out of bound .");
			Arrays.stream(a).forEach(num -> System.out.println(num));
		}else {
			for (int i = 0; i < a.length-1; i++) {
				if(i<n) {
					rs[i]=a[i];
				}else {
					rs[i]=a[i+1];
				}
			}
			Arrays.stream(rs).forEach(num -> System.out.println(num));
		}
	}
	// display missing elements in an sorted array.
	public static void missingElementInAnArray() {
		int[] a=new int[] {21,24,26,27,30};
		for(int i = 0; i < a.length-1; i++) {
			for (int j = a[i]++; j < a[i+1]; j++) {
				System.out.println(j);
			}
		}
	}
	
	public static void missingElementInAnArray1() {
		char[] chars=new char[] 
		{'a','b','a','z','c','m','r','n','o','a','c','b','k','k','k','l','l','o','h','z','r','q','x','w','y','a','b'};
		
		
		
		int[] rs=new int[128] ;
		for (int i = 0; i < chars.length; i++) {
			rs[chars[i]]++;
		}
		
		Map<Integer, List<Character>> map=new HashMap<Integer, List<Character>>();
		
		for (int i = 0; i < rs.length; i++) {
			if(rs[i]>0) {
				if(map.containsKey(rs[i])) {
					while(rs[i]>0) {
						map.get(rs[i]).add((char)i);
						rs[i]--;
					}
				}else {
					List<Character> characterSet=new ArrayList<Character>();
					int temp=rs[i];
					map.put(temp, characterSet);
					while(rs[i]>0) {
						characterSet.add((char)i);
						rs[i]--;
					}
				}
			}
		}
		System.out.println(map);
	}
}
