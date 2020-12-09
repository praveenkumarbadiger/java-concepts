package com.programming;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factorial(n);*/
		
		System.out.println(fact(5));
	}

	public static void factorial(int num) {
		int fact = 1;
		int temp =num;
		while(num!=0) {
			fact=fact*num;
			num--;
		}
		System.out.println("Factorial of given number "+temp+" : is "+fact);
	}
	
	public static int  fact(int n) {
		if(n==0)
			return 1;
		return n * fact(n-1);
	}
	
}
