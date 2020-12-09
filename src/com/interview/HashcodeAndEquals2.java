package com.interview;

import java.util.TreeSet;

public class HashcodeAndEquals2 {

	public static void main(String[] args) {
		TreeSet<Monkey> d= new TreeSet<Monkey>();
		d.add(new Monkey(1));
		d.add(new Monkey(2));
		d.add(new Monkey(1));
		System.out.println(d.size());
		// error : 
		// Exception in thread "main" java.lang.ClassCastException: 
		// com.interview.HashcodeAndEquals2$Monkey cannot be cast to java.lang.Comparable
	}
	static class Monkey{
		public Monkey(int i) {}
	}
}
