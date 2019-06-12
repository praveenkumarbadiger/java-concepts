package com.app.logic;

public class PerfectNumber {
	// Sum of its divisors is equal to number.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 100; i++) {
			if (isPrime(i)) {
				System.out.println("The Perfect number " + i);
			}
		}
	}

	static boolean isPrime(int num) {
		if(num==0)
			return false;
		int sum=0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum=sum+i;
			}
		}
		if(sum==num)
			return true;
		else
			return false;
	}
}
