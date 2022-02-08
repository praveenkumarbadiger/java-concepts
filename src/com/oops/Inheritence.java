package com.oops;

public class Inheritence {

	public static void main(String[] args) {
		A a= new A();
		a.m1();
		
		A b= new B();
		b.m1();
		
		A c= new C();
		c.m1();
	}

}
class A{
	void m1() {
		System.out.println("A");
	}
}
class B extends A{
	void m1() {
		System.out.println("B");
	}
}

class C extends B{
	void m1() {
		System.out.println("C");
	}
}