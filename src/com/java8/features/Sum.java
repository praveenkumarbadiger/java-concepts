package com.java8.features;

interface SumFunctionalInterface {
	public void sum(int a, int b);
}

public class Sum {
	
	public static void main(String[] args) {
		SumFunctionalInterface sfi = (a,b)-> System.out.println(a+b);
		sfi.sum(10, 120);
	}
}
