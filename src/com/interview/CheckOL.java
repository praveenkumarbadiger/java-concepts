package com.interview;

public class CheckOL {
	public static void main(String[] args) {
		new CheckOL().display("praveen");
	}
	
	public void display(Object o) {
		System.out.println("In Object method.....");
	}
	
	public void display(String o) {
		System.out.println("In String method.....");
		m1();
	}
	
	public void display(StringBuffer o) {
		System.out.println("In StringBuffer method.....");
	}
	
	private static void m1() {
		System.out.println("static m1 void");
	}
}