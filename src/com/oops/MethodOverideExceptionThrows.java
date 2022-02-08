package com.oops;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodOverideExceptionThrows {

	public static void main(String[] args) {
		
		//P p = new C();
	}

}
class College {
	
	void printName() throws Exception {
		System.out.println("Collge name is printed");
	}
}
class Department extends College {
	void printName() throws IOException {
		System.out.println("Department name is printed");
		throw new FileNotFoundException();
	}
}