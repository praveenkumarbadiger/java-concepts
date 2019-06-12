package com.app.logic;

public class ReverseLogic {
	public static void main(String[] args) {
		//reverseArray();
		//reverseString();
		//reverseNumber();
	}
	static void reverseArray() {
		int[] a= {10,20,30,40,50}; 
		int n=a.length;
		
		int[] b = new int[n];
		int j=n;
		for(int i= 0; i < n ; i++) {
			b[j-1]=a[i];
			j=j-1;
		}
		/*printing the reversed array*/
		for (int k = 0; k < n; k++) {
			System.out.print(b[k]); 
		}
	}
	
	static void reverseString() {
		String st="Praveen";
		StringBuffer sb= new StringBuffer();
		for (int i = st.length()-1; i >= 0 ; i--) {
			sb.append(st.charAt(i));
		}
		System.out.println(sb.toString());
	}
	
	static void reverseNumber() {
		int num=1024;
		System.out.println("Number is "+num);
		int reverseNum=0;
		while(num > 0) {
			int tempr=num%10;
			reverseNum=reverseNum*10+tempr;
			num=num/10;
		}
		System.out.println("Reversed Number is "+reverseNum);
	}
}
