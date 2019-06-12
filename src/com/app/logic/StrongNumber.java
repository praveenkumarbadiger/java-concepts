package com.app.logic;

public class StrongNumber {
	// Sum of factorial of each digit is equal to that number
	// ex: 1,2,145
	// ex1: 145=1!+4!+5!=145

	public static void main(String[] args) {
		for (int i = 0; i < 250; i++) {
			int sum = 0;
			int num = i;
			while (num > 0) {
				int temp = num % 10;
				sum = sum + Factorial.factorial(temp);
				num = num / 10;
			}
			if (i>0 && sum == i) {
				System.out.println("Prime number : "+i);	
			}
		}
	}
}
