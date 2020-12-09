package com.programming;

public class Pattern {

	public static void main(String[] args) {
		/*int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		/*int n=5;
		for(int i=1; i<=n; i++) {
			char c='a';
			for(int j=1; j<=i; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}*/
		
		/*int n=5;
		char c='a';
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}*/
		
		/*int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1 || i ==n || j==1 || j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		/*int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i==1 || i ==n || j==1 || j==n || i==j || i+j==n+1) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}*/
		
		/*int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j >=n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		/*int n=5;
		for (int i = 0; i < n; i++) {	
			for (int j = 0; j < n-1-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <=2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		int n=3;
		for (int i = 0; i < n; i++) {	
			for (int j = 0; j <n-1-i; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j <= i; j++) {
				if(j==0)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			for (int j = 0; j < 2*i; j++) {
				if(j==i-1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		for (int i = n-2; i > 0; i--) {	
			for (int j = 0; j <n-1-i; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j <= i; j++) {
				if(j==0)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			for (int j = 0; j < 2*i; j++) {
				if(j==i-1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
