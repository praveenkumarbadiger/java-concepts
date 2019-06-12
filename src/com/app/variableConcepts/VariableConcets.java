package com.app.variableConcepts;

public class VariableConcets {

	public static void main(String[] args) {
		Student student1=new Student();
		student1.x=100;
		student1.m1();
		System.out.println("==============================================");
		Student.y=200;
		Student student2=new Student();
		student2.x=110;
		student2.m1();
		System.out.println("==============================================");
		student1.m1();
		System.out.println("==============================================");
	}
}

class Student{
	int x=10;
	static int y=20;
	
	void m1() {
		System.out.println("X values is : "+x);
		System.out.println("Y values is : "+y);
	}
}