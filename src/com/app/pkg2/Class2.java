package com.app.pkg2;

import com.app.pkg1.Class1;

public class Class2 extends Class1{
	
	int num=20;
	
	public static void main(String[] args) {
		
		Class1 class2=new Class2();
		class2.m1();
	}
	
	public  void m1() {
		System.out.println(num);
	}
}