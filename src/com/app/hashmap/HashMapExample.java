package com.app.hashmap;

import java.util.HashSet;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Set<Integer> map=new HashSet<Integer>(10,1.0f);
		
		for(int i = 0; i< 20 ; i++ ) {
			map.add(i);
		}
		System.out.println(map);
	}
}
