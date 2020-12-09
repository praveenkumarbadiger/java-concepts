package com.exceptions;

public class Example1 {

	public static void main(String[] args) {
		System.out.println(throwMethod());

	}
	public static int throwMethod() {
		try {
			throw new ClassNotFoundException();
		} catch (Exception e) {
			throw new NullPointerException();
		}
	}
}
