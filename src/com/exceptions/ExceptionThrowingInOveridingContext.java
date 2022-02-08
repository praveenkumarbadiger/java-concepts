package com.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionThrowingInOveridingContext {

	public static void main(String[] args) throws IOException {
		
		Parent p = new Parent();

		p.m1();
	}

}

class Parent {
	void m1() throws IOException {
		throw new IOException();
	}
}

class Child extends Parent {
	void m1() throws RuntimeException {
		throw new RuntimeException();
	}
}
