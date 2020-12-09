	package com.programming;

public class PerfactNumber {

	public static void main(String[] args) {
		for(int i=1; i<100; i++) {
			if(i==isPerfect(i)) {
				System.out.println(i + " is perfect number !");
			}
		}

	}
	
	/*Sum of it's divisor is equal to that number
	 Note : The number itself is also one of the divisor but we will not consider it.
	 */	
	public static int isPerfect(int n) {
		int perfact = 0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				perfact = perfact+i;
			}
		}
		return perfact;
	}

}
