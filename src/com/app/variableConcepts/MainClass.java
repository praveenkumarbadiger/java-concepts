package com.app.variableConcepts;


public class MainClass {
	
	int x=10;
	static int y=20;
	
	public static void main(String[] args) {
		MainClass mainClass=new MainClass();
		mainClass.x=30;
		MainClass.y=30;
		mainClass.m1();
		
		System.out.println("----------------------------------------");
		MainClass mainClass1=new MainClass();
		mainClass1.x=31;
		mainClass1.m1();
		MainClass.y=40;
		
		System.out.println("----------------------------------------");
		mainClass.m1();
		System.out.println("----------------------------------------");
		mainClass1.m1();
		MainClass.y=50;
		
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");
		mainClass.m1();
		System.out.println("----------------------------------------");
		mainClass1.m1();
		
		
	}
	
	public void m1(){
		System.out.println("X value : "+this.x);
		System.out.println("Y value : "+this.y);
	}
	
}
