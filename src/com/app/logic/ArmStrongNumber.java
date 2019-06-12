package com.app.logic;

public class ArmStrongNumber {
	
	
	
	public static void main(String[] args) {
		for(int i=0;i<=500;i++) {
			int sum=0;
			int tempNum=i;
			int pow=getNoOfdigitsInNumber(i);
			while(tempNum>0) {
				int r=tempNum%10;
				sum=sum+power(r,pow);
				tempNum=tempNum/10;
			}
			if(i>0 && i==sum) {
				System.out.println("Arm strong number : "+i);
			}
		}
	}
	
	
	static int getNoOfdigitsInNumber(int num) {
		int pow=0;
		while(num>0) {
			pow++;
			num=num/10;
		}
		return pow;
	}
	
	static int power(int num,int pow) {
		int powered=1;
		while(pow>0) {
			powered=powered*num;
			pow--;
		}
		return powered;
	}
}
