package com.exceptions;

public class FinallyBreak {

	public static void main(String[] args) {
		System.out.println("something() return: "+something());

	}

	private static Boolean something() {
		
			try {
				return false;
			} finally {
				System.out.println("sdsdsds");
			}
	}

}
