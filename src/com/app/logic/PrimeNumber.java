package com.app.logic;

public class PrimeNumber {
	//Prime number is a number that is greater than 1 and divided by 1 or itself only.
	//For example 2, 3, 5, 7, 11, 13, 17.... 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 100; i++) {
			if(isPrime(i)) {
				System.out.println("The Prime number "+i);
			}
		}
	}
	
	static boolean isPrime(int num) {
		
		boolean isPrime=true;
		if(num==0 || num==1) {
			isPrime=false;
		}else {
			for (int i = 2; i <=num/2; i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		return isPrime;
	}
}
