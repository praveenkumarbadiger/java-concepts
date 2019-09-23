package com.app;

public class Test {
	public static void main(String[] args) {
		String name="genericFilter";
		String name2="Filter";
		if(name.contains(name2)) {
			System.out.println(name.replaceAll(name2, ""));			
		}
	}
}