package com.app.logic;

public class Factorial {

	public static void main(String[] args) {
		factorial(4);

	}
	static int factorial(int num) {
		//System.out.println("Given Number is "+num);
		int fact=1;
		while(num > 0) {
			fact=fact*num;
			num--;
		}
		//System.out.println("Reversed Number is "+fact);
		return fact;
	}
}
